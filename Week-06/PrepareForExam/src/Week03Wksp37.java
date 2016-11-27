/**
 * Created by Rita on 2016.11.27..
 */
public class Week03Wksp37 {
    public static void main(String[] args) {
        // Write a program which has this output
        //# # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replacable, hence store it in a variable

        char hash = '#';

        for (int i = 0; i <8 ; i++) {
                System.out.println();
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    System.out.printf(" %s", hash);
                } else {
                    System.out.printf("%s ", hash);
                }
            }
        }
    }
}
