/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop18 {
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter

        System.out.println(summary(4));
    }
    public static int summary(int givenP){
        int sumParameters = 0;
        for (int i = givenP; i > 0; i--){
            sumParameters += i;
        }
     return  sumParameters;
    }
}

