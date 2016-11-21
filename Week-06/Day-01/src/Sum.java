import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rita on 2016.11.21..
 */
public class Sum {

           public int sumNumbers(ArrayList<Integer> numbers) {
            int sums = 0;
            for (int i : numbers)
                sums += i;
            return sums;
        }
}

