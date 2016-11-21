import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by Rita on 2016.11.21..
 */
public class SumTest {
    @Test
    public void sumNumbers() throws Exception {
        Sum myObject = new Sum();
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 2, 5, 7, 14, 58, 32, 60);
        ArrayList<Integer> numbers2 = new ArrayList<>();
        Collections.addAll(numbers2, 1);
        ArrayList<Integer> numbers3 = new ArrayList<>();
        Collections.addAll(numbers3, 0);


        assertEquals(178, myObject.sumNumbers(numbers));
        assertEquals(1, myObject.sumNumbers(numbers2));
        assertEquals(0, myObject.sumNumbers(numbers3));

    }



    }
