import javax.lang.model.element.NestingKind;

/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop12a {
    public static void main(String[] args) {
        // Swap the first element of the array
        // Expected output: third second first
        String[] abc = new String[] { "first", "second", "third" };

        String temp = null;
        temp = abc[0];
        abc[0]=abc[2];
        abc[2]=temp;

        for(int i=0;i<abc.length;i++){
            System.out.print(abc[i] + " ");
        }
    }
}
