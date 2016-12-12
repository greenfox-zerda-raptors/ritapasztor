#1
select * from movie;
select title from movie where director = 'Steven Spielberg';

/* #2 Find all years that have a movie that received a rating of 4 or 5,
 and sort them in increasing order. */

SELECT distinct year
from Movie
join rating on movie.mID = Rating.mID
where stars between 4 and 5
order by year asc;

/*#3 Find the titles of all movies that have no ratings. */
select title from movie 
where not exists 
(select mID from rating where movie.mID = rating.mID);

/*#4 Some reviewers didn't provide a date with their rating. 
Find the names of all reviewers who have ratings with 
a NULL value for the date. */
select name
from reviewer
join rating on rating.rID = reviewer.rID
where ratingDate is null;

/*#5 Write a query to return the ratings data in a more readable 
format: reviewer name, movie title, stars, and ratingDate. 
Also, sort the data, first by reviewer name, then by movie title, 
and lastly by number of stars.*/
select reviewer.name, movie.title, rating.stars, rating.ratingDate
FROM reviewer, movie, rating
where rating.mID = movie.mID AND reviewer.rID = rating.rID
order by reviewer.name, movie.title, rating.stars;

/*For all cases where the same reviewer rated the same movie 
twice and gave it a higher rating the second time, return the 
reviewer's name and the title of the movie. */
