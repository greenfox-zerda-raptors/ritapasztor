/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop20 {
    public static void main(String[] args) {
        // create a function that returns it's input factorial

        System.out.println(r(5));
    }
    public static int r(int a){
        int t = 1;
        for (int i = a; i > 0; i--) {
            t *= i;
        }
        return t;
    }
}
