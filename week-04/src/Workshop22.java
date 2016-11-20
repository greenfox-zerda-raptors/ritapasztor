/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop22 {
    public static void main(String... args) {
        // create a function which prints the input String parameters (can have multiple number of arguments)
        // google for multiple number of arguments

        System.out.println();
        paramPrinter("alma","korte");
    }
    public static void  paramPrinter(String ... x){ //printelni fog, lehet void
        //String... more string can be added, when u use it, more strings can be added without an array
        for (String s : x) {
            System.out.println(s);
        }

    }
}

