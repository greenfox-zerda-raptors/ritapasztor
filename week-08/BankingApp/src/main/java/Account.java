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
    int balance = 0;

    public Account() {
    }

    public Account(String type) {
        this.type = type;
    }

    @Override
    public void deposit(int depositAmount) {
        balance += depositAmount;
        //System.out.println("On " + user.getFirstName() + "'s account, new balance  is " + balance + " EUR");
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void transfer(int transferredAmount, Account accountTo) {
        this.balance -= transferredAmount;
        accountTo.deposit(transferredAmount);
    }

    public void withdraw(int withdrawnAmount) {

    }

    public void audit() {

    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "type: " + type;
    }
}