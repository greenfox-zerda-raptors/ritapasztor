/**
 * Created by Rita on 2016.12.04..
 */
public class App {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.add(new SavingsAccount(01, 32000, 0.05));
        bank.add(new SavingsAccount(02, 500000, 0.1));
        bank.add(new SavingsAccount(03));
        bank.add(new SavingsAccount(04, 140000, 0.06));
        bank.add(new CurrentAccount(01));
        bank.add(new CurrentAccount(02, 15000));
        bank.add(new CurrentAccount(03));

        bank.printBank();

        bank.updateMethod();

        bank.printBank();

    }

}
