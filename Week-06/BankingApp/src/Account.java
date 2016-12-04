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

    public Account(int accountNumber, double balance) {
        this.balance = balance;
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

    @Override
    public String toString() {
        return "On " + getClass().getSimpleName()  + " no. " + accountNumber + " current balance is "
                + balance + " EUR";
    }

    public abstract void update();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public final void print() {
        //Don't override this,
        //override the toString method
        System.out.println(toString());
    }
}

