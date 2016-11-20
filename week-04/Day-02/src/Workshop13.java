import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Rita on 2016.11.20..
 */
public class Workshop13 {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list using a for loop and an Iterator

//        for (String i: list){
//            System.out.println(i);
//        }
        //Iterator<String> itiList = list.iterator();
        for (Iterator<String> itiList = list.iterator(); itiList.hasNext();) {
            System.out.println(itiList.next());
        }

    }
}
