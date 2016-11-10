/**
 * Created by Rita on 2016.11.09..
 */

import java.util.*;
public class Worhshop02 {
    public static void main(String[] args){
        String[] numbers = new String[] { "one", "two", "three", "four", "five"};


            for(int i = 0; i <= numbers.length; i++) {
                try {
                    System.out.print(i);
                    System.out.print("=" + numbers[i] + "\n");
                }
                catch ( ArrayIndexOutOfBoundsException e) {
                    System.out.println("if you see me, the guys had baaaad indexes");
                }
        }


        System.out.println("::::FINISH LINE::::");
    }
}