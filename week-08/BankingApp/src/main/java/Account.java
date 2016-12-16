import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;

/**
 * Created by Rita on 2016.12.14..
 */
@DatabaseTable(tableName = "Account")
public class Account implements Transactions {
    @DatabaseField(generatedId = true)
    private int accountID;
    @DatabaseField
    String type;
    @DatabaseField
    int balance = 0;

    ArrayList<Account> accounts;

    public Account() {
    }

    public Account(String type) {
        this.type = type;
    }

    public void deposit(int depositAmount) {
        balance += depositAmount;
        //System.out.println("On " + user.getFirstName() + "'s account, new balance  is " + balance + " EUR");
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(int transferredAmount, Account accountTo) {
        this.balance -= transferredAmount;
        accountTo.deposit(transferredAmount);
    }

    public void withdraw(int withdrawnAmount) {
        this.balance -= withdrawnAmount;
        System.out.println(withdrawnAmount + " withdrawn, current balance: " + this.balance);

    }

    public void audit() {

    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

//    public String toString() {
//        return
//    }
}