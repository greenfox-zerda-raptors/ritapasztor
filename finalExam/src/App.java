import java.util.ArrayList;

/**
 * Created by Rita on 2017.02.17..
 */
public class App {
    public static void main(String[] args) {
        FinalExam finalExam = new FinalExam();
        ArrayList<String> strings = new ArrayList<>();
        String character = " ";

        strings.add("ab");
        strings.add("cde");
        strings.add("fg");


        System.out.println(finalExam.joinStrings(strings, character));
    }
}
