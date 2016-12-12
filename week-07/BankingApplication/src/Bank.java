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
        User user3 = new User("Hapci", "Torpe", "Bokor utca");
        users.add(user3);
        User user4 = new User("Morgo", "Torpe", "Fa utca");
        users.add(user4);
        User user5 = new User("Kuka", "Torpe", "Virag ter");
        users.add(user5);
        User user6 = new User("Tudor", "Vidor", "Banya koz");
        users.add(user6);

        CheckingAccount checkingAccount1 = new CheckingAccount(01, user1);
        accounts.add(checkingAccount1);
        CheckingAccount checkingAccount2 = new CheckingAccount(02, user2);
        accounts.add(checkingAccount2);
        SavingsAccount savingsAccount1 = new SavingsAccount(03, user3);
        accounts.add(savingsAccount1);
        SavingsAccount savingsAccount2 = new SavingsAccount(04, user4);
        accounts.add(savingsAccount2);
        MoneyMarket moneyMarket1 = new MoneyMarket(05, user5);
        accounts.add(moneyMarket1);
        MoneyMarket moneyMarket2 = new MoneyMarket(06, user6);
        accounts.add(moneyMarket2);
    }

    public void print() {
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }
    public void manage() {
        //this way I cannot see the accounts, I would need a map for that (hashmap)

        accounts.get(0).deposit(1000);
        accounts.get(1).deposit(2000);
        accounts.get(2).deposit(500);
        System.out.println(accounts.get(3).getBalance());
        accounts.get(4).deposit(5000);
        accounts.get(5).deposit(4500);

        System.out.println();

        accounts.get(4).transfer(2000, accounts.get(2));
        System.out.println(accounts.get(4).getBalance());
        System.out.println(accounts.get(2).getBalance());

        System.out.println();

        accounts.get(1).transfer(1200, accounts.get(2));
        System.out.println(accounts.get(2).getBalance());
        System.out.println(accounts.get(1).getBalance());

    }
}
