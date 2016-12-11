/**
 * Created by Rita on 2016.12.11..
 */
public abstract class Account {
    private int accountID;
    private String firstName;
    private String lastName;
    private String address;
    private double balance;

    public Account(int accountID, String firstName, String lastName, String address) {
        balance = 0;
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

    }

    public abstract void audit();

    public void deposit(int depositAmount) {
        balance += depositAmount;
        System.out.println("On " + firstName + "'s account, new balance is " + balance + " EUR");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + " type " +
                "account no. " + accountID +
                ", " + firstName + " " + lastName + " " +
                ", account balance = " + balance + " EUR.";
    }


    public void transfer(int transferredAmount, Account accountTo) {
        this.balance -= transferredAmount;
        accountTo.deposit(transferredAmount);
    }
}

