import java.util.Arrays;

/**
 * Created by Rita on 2016.11.28..
 */
public class Week03Day03Wksp08 {
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        // Task 2: Print this two dimensional array to the output

        int[][] multiArray = new int [4][4];

        for (int i = 0; i < 4; i++) {
            multiArray[i][i] = 1;
        }

        for(int[] row : multiArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
