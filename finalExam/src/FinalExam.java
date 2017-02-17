import java.util.ArrayList;

/**
 * Created by Rita on 2017.02.17..
 */
public class FinalExam {
    public String joinStrings(ArrayList strings, String character) {
        String result = "";
        for (int i = 0; i < strings.size(); i++) {

            if (i < strings.size()) {
                result += strings.get(i) + character;
            } else {
                result += strings.get(i);
            }
        }
        return result;

    }
}

