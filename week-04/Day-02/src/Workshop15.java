import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Rita on 2016.11.20..
 */
public class Workshop15 {
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7" ));
        // Add "a" to every string in al. Use a for(each) loop

        for (String i : al){
            System.out.println(i + 'a');
        }
    }
}
