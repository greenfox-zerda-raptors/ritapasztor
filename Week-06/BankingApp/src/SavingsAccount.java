/**
 * Created by Rita on 2016.12.04..
 */
public class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber) {
        super(accountNumber);
    }

    private double interest;

    public double addInterest() {
        return this.getBalance() + interest;
    }
}
