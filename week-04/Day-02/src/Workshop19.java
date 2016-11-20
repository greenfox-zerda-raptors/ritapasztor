/**
 * Created by Rita on 2016.11.08..
 */
public class Workshop19 {
    public static void main(String... args){
        String name = "World";
        StringBuilder builder = new StringBuilder("Heljo");
        //Please change "Heljo" to "Hello" and add name ("World") to the end of the string builder

        builder.replace(0, 5, "Hello ");

        System.out.println(builder.append(name));

    }
}
