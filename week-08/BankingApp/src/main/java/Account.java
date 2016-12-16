import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

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
    int balance;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private User user;

    public Account() {
    }

    public Account(String type, User user) {
        this.type = type;
        this.user = user;
        if (type.equals("SavingsAccount")) {
            balance = 1000;
        } else {
            balance = 0;
        }
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

    public String getType() {
        return type;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setType(String type) {
        this.type = type;
    }

}