/**
 * Created by Rita on 2016.11.27..
 */
public class Week03Wksp36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable

        char a = '#';

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.printf(" %s",a);
            }
        }

        System.out.println();
    }
}
