/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop13a {
    public static void main(String[] args) {
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        // print the sum of all numbers in ah
        int sumManual = 0;
        for (int i = 0; i < ah.length; i++) {
            sumManual+=ah[i];
        }
        System.out.println("Result: " + sumManual);
    }
}
//same as Workshop13, manual solution