import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Rita on 2016.12.15..
 */

@DatabaseTable(tableName = "User")
public class User {
    @DatabaseField(generatedId = true)
    private int userId;
    @DatabaseField
    private String firstName;
    @DatabaseField
    private String lastName;
    @DatabaseField
    private String address;
    @ForeignCollectionField(eager = true)
    private Collection<Account> accounts;

    private String type;

    public User() {
    }

    public User(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void addAccount(String type) {
        if (accounts == null) {
            accounts = new ArrayList<Account>();
        }
        if (type.equals("S")) {
            accounts.add(new Account("SavingsAccount", this));
        }
        if (type.equals("C")) {
            accounts.add(new Account("CheckingAccount", this));
        }
        if (type.equals("M")) {
            accounts.add(new Account("MoneyMarket", this));
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

    public Collection<Account> getAccounts() {
        return accounts;
    }

}