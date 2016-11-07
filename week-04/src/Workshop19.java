/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop19 {
    public static void main(String[] args) {
        // create a function that returns it's input factorial

        System.out.println(fact(4));
    }
    public static int fact(int inputP){
        int factValue = 1;
        for (int i = inputP; i > 0; i--) {
            factValue *= i;
        }
        return factValue;
    }
}
