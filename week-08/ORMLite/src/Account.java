import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Rita on 2016.12.14..
 */
@DatabaseTable(tableName = "Account")
public class Account {
    @DatabaseField(id = true)
    String name;
    @DatabaseField
    String password;

    public Account() {
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


