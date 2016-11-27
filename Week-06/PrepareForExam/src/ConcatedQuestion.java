import java.lang.*;
import java.lang.String;

/**
 * Created by Rita on 2016.11.27..
 */
public class ConcatedQuestion {
    public static void main(String[] args) {
        String concated = "Hope for the best " + "but";
        concated = concated + " prepare";
        concated += " for ";
        concated.concat("the worst.");
        System.out.println(concated);
    }
}
