import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;

/**
 * Created by Rita on 2016.12.15..
 */
@DatabaseTable
public class User {
    @DatabaseField(generatedId = true)
    private int userId;
    @DatabaseField
    private String firstName;
    @DatabaseField
    private String lastName;
    @DatabaseField
    private String address;
    @DatabaseField(foreign = true)
    private ArrayList<Account> accounts = new ArrayList<Account>();

    private String type;


    public User(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void addAccount(String type) {
        if (type.equals("S")) {
            accounts.add(new Account("SavingsAccount"));
        }
        if (type.equals("C")) {
            accounts.add(new Account("CheckingAccount"));
        }
        if (type.equals("M")) {
            accounts.add(new Account("MoneyMarket"));
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserId: ");
        sb.append(userId).append(", firstName: ").append(firstName)
                .append('\'').append(", accounts: ");
        for (Account a : accounts) {
            sb.append(a);
            sb.append(" \n");
        }
        return sb.toString();
    }
}