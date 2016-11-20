/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop34b {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".
        String s;

        for( int l = 1; l <=100;l++)
        {
        //initialisation
            if (l % 3 == 0) {
                s = "Fizz";
            } else {
                s = "";
            }
            if (l % 5 == 0) {
                s += "Buzz";
            }
            if (s == ""){

                System.out.println(l);
            } else {
                System.out.println(s);
            }
        }
    }
}
