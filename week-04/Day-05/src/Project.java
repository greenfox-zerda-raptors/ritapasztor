/**
 * Created by Rita on 2016.11.11..
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter a top number in the range, or 0!");
        int topValue = userInput.nextInt();

        int randomNumber = r.nextInt(topValue) + 1;
        int numberOfHints = 0;
        int hint = 0;
        System.out.println("I have the number. You have 6 guesses. ");

        while(hint != randomNumber && numberOfHints < 6) {

                try {
                    hint = userInput.nextInt();
                } catch (InputMismatchException e){
                    System.out.println("Please enter a number, with a maximum value of: " + topValue);
                }
            numberOfHints++;
            if (hint < randomNumber){
                int numberOfGuess = 6 - numberOfHints;
                System.out.println("Nope. It's too low. You have " + numberOfGuess + " guess(es) left.");
            } else if (hint > randomNumber) {
                int numberOfGuess = 6 - numberOfHints;
                System.out.println("Nope. It's too high. You have " + numberOfGuess + " guess(es) left.");
            } else {
                System.out.println("Yeah!! You're SUPER!");
            }
        }
        if (numberOfHints>=6){
            System.out.println("You couldn't make it this time");
            System.out.println("Random number was: " + randomNumber);
        }



    }

}
