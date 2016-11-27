/**
 * Created by Rita on 2016.11.27..
 */
public class FirstCharWorkshop {
    public static void main(String[] args) {
        String y = "seasons";
        int out = 6;

        if(y.charAt(0) == y.charAt(y.length()-1)) {
        System.out.println(out*2);
        } else {
            System.out.println(out/2);
        }

    }
}
