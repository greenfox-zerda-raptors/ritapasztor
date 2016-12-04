/**
 * Created by Rita on 2016.12.04..
 */
public class SavingsAccount extends Account {
    private double interest;
    private double interestRate;

    public SavingsAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public void update() {
        this.addInterest();
        System.out.println("Balance ");

    }

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        this.setBalance(this.getBalance() * (1 + interestRate));
    }
}
