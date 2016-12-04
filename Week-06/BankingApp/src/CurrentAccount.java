/**
 * Created by Rita on 2016.12.04..
 */
public class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber) {
        super(accountNumber);
    }

    public CurrentAccount( int accountNumber, double balance) {
        super( accountNumber, balance);
    }

    @Override
    public void update() {
        System.out.println("Updated current account");
    }

    private double overdraftLimit;


}
