import java.util.Arrays;

/**
 * Created by Rita on 2016.11.27..
 */
public class Week03Day03Wksp10 {
    public static void main(String[] args) {

        // Task 1: Create an array (jagged) which can contain the different shades of specified colors
        // in colors[0] store the shades of green: "lime", "forest green", "olive", "pale green", "spring green"
        // in colors[1] store the shades of red: "orange red", "red", "tomato"
        // in colors[2] store the shades of pink: "orchid", "violet", "pink", "hot pink"

        String colors[][] ={
            {"lime", "forest green", "olive", "pale green", "spring green"},
            {"orange red", "red", "tomato"},
            {"orchid", "violet", "pink", "hot pink"}
        };


        // Task 2: Print the values of the array to the console
//        for (int i = 0; i < 3; i++) {
//            System.out.println(Arrays.toString(colors[i]));
//        }

        for(String[] j : colors) {
            System.out.println(Arrays.toString(j));

        }
    }

}
