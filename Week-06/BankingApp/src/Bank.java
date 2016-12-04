import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Rita on 2016.12.04..
 */
public class Bank extends ArrayList<Account> {
    public void printBank() {
        for (Account account : this) {
            System.out.println(account.toString());
        }
    }

    public void updateMethod() {
        for (Account account : this) {
            account.update();
        }

    }


}
