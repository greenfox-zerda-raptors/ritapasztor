import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Rita on 2016.11.08..
 */
   public class Workshop16{
        public static void main(String... args){
            ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(3, 6, 4, 9, 5, 6, 7 ));
            // Fix this code fragment! It should remove every even number from the list.

//
           for(Iterator<Integer> iti = al.iterator(); iti.hasNext();) {
               int element = iti.next();
               if (element % 2 == 0) {
                   iti.remove();
               }
           }
            System.out.println(al);
        }
}
