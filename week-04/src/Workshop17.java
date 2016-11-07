/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop17 {
    public static void main(String[] args) {
        String ag = "kuty";
        String ah = "macsk";
        // write a function that gets a string as an input
        // and appends an 'a' character to its end

        System.out.println(additionalA(ag));
        System.out.println(additionalA(ah));
    }
    public static String additionalA(String input){
        return input + "a";
    }
}
