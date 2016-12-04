/**
 * Created by Rita on 2016.12.04..
 */
public abstract class Account {
    private double balance;  //The current balance
    private int accountNumber;  //The account number


    public Account(int accountNumber) {
        balance = 0.0;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amountAdded) {
        if (amountAdded > 0)
            balance += amountAdded;
        else
            System.err.println("Account.deposit(...): "
                    + "cannot deposit negative amount.");
    }

    public void withdraw(double amountWithdrawn) {
        if (amountWithdrawn > 0)
            balance -= amountWithdrawn;
        else
            System.err.println("Account.withdraw(...): "
                    + "cannot withdraw negative amount.");
    }

    public double getBalance() {
        return balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public String toString() {
        return "Acc " + accountNumber + ": " + "balance = " + balance;
    }

    public final void print() {
        //Don't override this,
        //override the toString method
        System.out.println(toString());
    }
}

