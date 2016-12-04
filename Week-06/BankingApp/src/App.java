/**
 * Created by Rita on 2016.12.04..
 */
public class App {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.add(new SavingsAccount(001));
        bank.add(new SavingsAccount(002));
        bank.add(new SavingsAccount(003));
        bank.add(new SavingsAccount(004));
        bank.add(new CurrentAccount(005));
        bank.add(new CurrentAccount(006));
        bank.add(new CurrentAccount(007));

    }

}
