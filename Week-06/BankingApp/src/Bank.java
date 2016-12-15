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

    public void openAccount() {
        System.out.println("Please enter a number for your new account: ");
        int accountNumber;
        Scanner sc = new Scanner(System.in);
        accountNumber = sc.nextInt();
        if (this.contains(accountNumber)) {
            System.out.println("This number is used already");
        } else {
            this.add(new SavingsAccount(accountNumber));
            this.add(new CurrentAccount(accountNumber));
        }


    }



}
