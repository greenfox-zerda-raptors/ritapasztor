import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;
import java.lang.reflect.Array;


/**
 * Created by Rita on 2016.11.08..
 */
public class Workshop05 {
    public static void main(String... args){
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array

        Integer[] newArray = new Integer[numList.size()];
        newArray = numList.toArray(newArray);

        for (Integer i : newArray) {
        System.out.println(i);
        }
    }
}
//long version is below just to remember:
//         for (int i = 0; i < newArray.length ; i++) {
//            System.out.println(newArray[i]);
//        }