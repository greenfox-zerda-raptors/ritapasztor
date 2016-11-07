/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop16 {
    public static void main(String[] args) {
        String ae = "Misi";
        String ea = "Rita";
        // create a function that greets ae

        System.out.println(greetSomebody(ae));
        System.out.println(greetSomebody(ea));
    }
    public static String greetSomebody (String toGreet) {
        return "Hello " + toGreet;
    }
}
