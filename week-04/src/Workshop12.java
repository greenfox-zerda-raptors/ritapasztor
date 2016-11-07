/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop12 {
    public static void main(String[] args) {
        // Swap the first element of the array
        // Expected output: third second first
        String[] abc = new String[] { "first", "second", "third" };

        for(int i=2;i<abc.length;i--){
            System.out.print(abc[i] + " ");
        }
    }
}
