package date;

import org.joda.time.Days;
import org.joda.time.LocalDate;

import java.util.Scanner;

/**
 * Created by kicsen on 2016. 11. 30..
 */
public class BirthdayWithJodaTime implements BirthdayCalculator<LocalDate> {

    @Override
    public LocalDate parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        LocalDate date = LocalDate.parse(str);
        return date;
    }

    @Override
    public String printMonthAndDay(LocalDate date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        return date.toString("MM. dd.");
    }

    @Override
    public boolean isAnniversaryToday(LocalDate date) {
        // TODO - return with true if today is the same month+day as date
        LocalDate today = new LocalDate();
        return printMonthAndDay(today).equals(printMonthAndDay(date));
    }

    @Override
    public int calculateAgeInYears(LocalDate birthday) {
        // TODO - return how many years age the input date 'birthday' was
        LocalDate today = new LocalDate();
        return today.getYear() - birthday.getYear();
    }

    @Override
    public int calculateDaysToNextAnniversary(LocalDate date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        LocalDate today = new LocalDate();
        date.withYear(today.getYear());
        int birthdayDay = date.getDayOfYear();
        int todayDay = today.getDayOfYear();
        if (todayDay > birthdayDay) {
            return Days.daysBetween(date, today).getDays();
        } else {

        }

        return Days.daysBetween(today, date).getDays();


//        if (!date.isAfter(today)) {
//            today.withYear(date.getYear() + 1);
//        }
//        int birthdayDay = date.getDayOfYear();
//        int todayDay = today.getDayOfYear();
//
//        int diff;
//        if (todayDay > birthdayDay) {
//            diff = birthdayDay - todayDay + 365;
//        } else {
//            diff = todayDay - birthdayDay;
//        }
//        return diff;
    }

    public static void main(String[] args) {
        new BirthdayWithJodaTime().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        LocalDate birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");
}
