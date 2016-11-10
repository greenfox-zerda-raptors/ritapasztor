/**
 * Created by Rita on 2016.11.09..
 */

import java.util.*;

public class Workshop03 {
    static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {
        int input = -1; //kiindulasi ertek, ne legyen 0, mert nem fog mukodni. -1 mert a true es false binaris ertekei 1 es 0
        while (input != 0 ) { //emiatt nem indithatsz 0-rol; el sem indulna a loop, azonnal Bye!
            System.out.print("INPUT or 0 to end?");
            try {
                input = keyboardInput.nextInt();
                if(input != 0) {//megegyszer tesztelni, h 0 e, mert kulonben kiirna h yum
                    String inputStr = Integer.toString(input);
                    System.out.println("Yum" + inputStr.substring(0, inputStr.length()/2));
                }
            } catch (InputMismatchException e) {
                System.out.println("Add a number which is not too high\n " + e.getMessage());
                keyboardInput.nextLine(); //a positiont a vegere allitja - igy tud tovabb ugrani es kijonni a loop-bol
            }
        }
        System.out.println("Bye!");

    }
}
//        Integer number = 1;
//        String s ;
//        while (number !=0 ) {
//            number = checkIfValid();
//            s = number.toString();
//            System.out.println("Yum" +  s.substring(0,s.length()/2));
//        }
//    }
//    public static Integer checkIfValid() {
//        int i =0;
//        boolean flLoop = true;
//        while (flLoop) {
//            System.out.print("Type in a number: ");
//            try (
//                i = userInput.nextInt();
//            ) catch (InputMismatchException e)(
//
//                    )//itt keletkezhet a kivetel, ezert ide kell a try and catch
//            flLoop = false;
//            userInput.nextLine();
//        }
//        return i;
//    }

