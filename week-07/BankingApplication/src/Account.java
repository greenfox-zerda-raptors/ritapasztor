/**
 * Created by Rita on 2016.12.11..
 */
public abstract class Account {
    int accountID;
    String firstName;
    String lastName;
    String address;
    double balance;

    public Account(int accountID, String firstName, String lastName, String address) {
        balance = 0;
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

    }

    public abstract void audit();

    public double deposit(double depositAmount) {
        return balance;
    }

}

