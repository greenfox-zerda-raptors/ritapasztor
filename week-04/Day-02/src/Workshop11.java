import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Rita on 2016.11.20..
 */
public class Workshop11 {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list

        for (String i : list){
            System.out.println(i);
        }
    }
}
