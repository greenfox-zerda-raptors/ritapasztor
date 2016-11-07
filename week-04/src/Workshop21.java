/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop21 {
    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial

        System.out.println(fact(4));
    }
    public static long fact(int num){
        if (num == 1) return 1;
        return num * fact(num-1);
    }
}
