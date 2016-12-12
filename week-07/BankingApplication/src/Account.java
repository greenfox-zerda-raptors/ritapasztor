/**
 * Created by Rita on 2016.12.11..
 */
public abstract class Account implements Transactions {
    private int accountID;
    private User user;
    private double balance = 0;

    public Account(int accountID, User user) {
        this.accountID = accountID;
        this.user = user;
    }

    public abstract void audit();

    @Override
    public void deposit(int depositAmount) {
        balance += depositAmount;
        System.out.println("On " + user.getFirstName() + "'s account, new balance is " + balance + " EUR");
    }

    @Override
    public double getBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + " type " +
                "account no. " + accountID +
                ", " + user.getFirstName() + " " + user.getLastName() + " " +
                ", account balance = " + balance + " EUR.";
    }

    @Override
    public void transfer(int transferredAmount, Account accountTo) {
        this.balance -= transferredAmount;
        accountTo.deposit(transferredAmount);
    }
}

