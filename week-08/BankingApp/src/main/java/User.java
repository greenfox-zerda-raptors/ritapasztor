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

    public User(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
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
}