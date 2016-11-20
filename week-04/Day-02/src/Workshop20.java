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

        sb.insert(0, "first line\n");
        //sb.length();
        //System.out.println(sb.length());
        sb.insert(23, "third line\n");

        System.out.println(sb.toString());
    }
}
