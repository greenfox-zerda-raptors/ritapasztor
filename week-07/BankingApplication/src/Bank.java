import java.util.ArrayList;

/**
 * Created by Rita on 2016.12.11..
 */
public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public Bank() {
        User user1 = new User("Szende", "Torpe", "Erdo utca");
        users.add(user1);
        User user2 = new User("Szundi", "Torpe", "Mezo utca");
        users.add(user2);
        users.add(new User("Hapci", "Torpe", "Bokor utca"));
        users.add(new User("Morgo", "Torpe", "Fa utca"));
        users.add(new User("Kuka", "Torpe", "Virag ter"));
        users.add(new User("Tudor", "Vidor", "Banya koz"));

        
    }

    public void print() {

        CheckingAccount checkingAccount1 = new CheckingAccount(01, "Szende", "Torpe", "Erdo utca");
        accounts.add(checkingAccount1);
        CheckingAccount checkingAccount2 = new CheckingAccount(02, "Szundi", "Torpe", "Mezo utca");
        accounts.add(checkingAccount2);
        SavingsAccount savingsAccount1 = new SavingsAccount(03, "Hapci", "Torpe", "Bokor utca");
        accounts.add(savingsAccount1);
        SavingsAccount savingsAccount2 = new SavingsAccount(04, "Morgo", "Torpe", "Fa utca");
        accounts.add(savingsAccount2);
        MoneyMarket moneyMarket1 = new MoneyMarket(05, "Kuka", "Torpe", "Virag ter");
        accounts.add(moneyMarket1);
        MoneyMarket moneyMarket2 = new MoneyMarket(06, "Tudor", "Vidor", "Banya koz");
        accounts.add(moneyMarket2);

        for (Account account : accounts) {
            System.out.println(account.toString());
        }

        checkingAccount1.deposit(1000);
        checkingAccount2.deposit(2000);
        savingsAccount1.deposit(500);
        System.out.println(savingsAccount2.getBalance());
        moneyMarket1.deposit(5000);
        moneyMarket2.deposit(4500);

        moneyMarket1.transfer(2000, savingsAccount2);
        System.out.println(moneyMarket1.getBalance());
        System.out.println(savingsAccount2.getBalance());

        for (Account account : accounts) {
            System.out.println(account.toString());
        }

        System.out.println();

        checkingAccount2.transfer(1200, savingsAccount1);
        System.out.println(checkingAccount2.getBalance());
        System.out.println(savingsAccount1.getBalance());


    }
}
