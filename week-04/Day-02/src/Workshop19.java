/**
 * Created by Rita on 2016.11.08..
 */
public class Workshop19 {
    public static void main(String... args){
        String name = "World";
        StringBuilder builder = new StringBuilder("Heljo");
        //Please change "Heljo" to "Hello" and add name ("World") to the end of the string builder
        System.out.println(builder.deleteCharAt(3));
        System.out.println(builder.insert (3,'l'));
        System.out.println(builder.append(" World"));

    }
}
