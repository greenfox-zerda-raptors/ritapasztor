import java.net.SocketTimeoutException;

/**
 * Created by Rita on 2016.11.08..
 */
public class Workshop20 {
    public static void main(String... args) {
        StringBuilder sb = new StringBuilder("second line\n");
        // Add "first line" to the beginning of the sb
        // Add "third line" to the end of the sb
        // Expected output:
        // first line
        // second line
        // third line


        System.out.println(sb.insert(0, "first line\n"));
                //sb.append("\nthird line")); //its not working zet, Im on it :)
        //System.out.println(sb.toString());
    }
}
