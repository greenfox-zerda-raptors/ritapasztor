/**
 * Created by Rita on 2016.11.11..
 */

import java.util.Random;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter a top number in the range, or 0!");
        int topValue = userInput.nextInt();

        int gondolat = r.nextInt(topValue) + 1;
        int tippekSzama = 0;
        int tipp = 0;

        while(tipp != gondolat && tippekSzama < 6) {
            System.out.println("Mi a tipped?");
            tipp = userInput.nextInt();
            tippekSzama++;
            if (tipp < gondolat){
                System.out.println("tul kicsi");
            } else if (tipp > gondolat) {
                System.out.println("tul nagy");
            } else {
                System.out.println("szuperjo vagy");
            }
        }
        if (tippekSzama>=6){
            System.out.println("Tul sokszor probalkoztal");
        }



    }

}
