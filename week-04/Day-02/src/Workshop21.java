/**
 * Created by Rita on 2016.11.08..
 */
public class Workshop21 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first third fourth");
        // Add "second" to the StringBuilder (sb) between the words "first" and "third"
        // Expected output: first second third fourth

        System.out.println(sb.insert(5, " second"));
        //System.out.println(sb.toString()); //how can I do within this line?
    }
}
