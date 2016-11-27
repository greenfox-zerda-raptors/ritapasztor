/**
 * Created by Rita on 2016.11.27..
 */
public class Week03Wksp35 {
    public static void main(String[] args) {
        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567

        int b = 8;
        for (int i = 1; i < b ; i++) {
            for (int j = 1; j < b; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                System.out.print('*');
            }
        }
        System.out.println();
    }
}
}
