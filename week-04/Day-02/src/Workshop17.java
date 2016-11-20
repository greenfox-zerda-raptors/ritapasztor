import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rita on 2016.11.20..
 */
public class Workshop17 {
    // Implement trimAll(..)
    // Expected output:
    // "first"
    // "second"
    // "third"
    // "fourth"
    // "fifth"

    static void trimAll(List<String> strings) {

    }

    public static void main(String... args){
        List<String> strList = new ArrayList<String>(Arrays.asList("   first", "second   ", "  third ", "fourth", "    fifth "));
        trimAll(strList);
        for (String str : strList) {
            System.out.println(str.trim());
            //System.out.format("\"%s\"%n", str);
        }
    }
}
