import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Rita on 2016.12.16..
 */
public class Database {
    private Dao<User, Integer> userDao;
    private Dao<Account, Integer> accountDao;

    public void setUpDatabase() throws SQLException {

        String databaseUrl = "jdbc:mysql://localhost:3306/bankingapp?user=root&password=R1tcsi&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        userDao = DaoManager.createDao(connectionSource, User.class);
        accountDao = DaoManager.createDao(connectionSource, Account.class);

        TableUtils.createTableIfNotExists(connectionSource, User.class);
        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        connectionSource.close();
    }

    public void createUserIfNotExists(User usr) throws SQLException {
        if (userDao.queryForId(usr.getUserId()) == null) {
            userDao.create(usr);
            for (Account acc : usr.getAccounts()) {
                createAccountIfNotExists(acc);
            }
        }
    }

    public void createAccountIfNotExists(Account acc) throws SQLException {
        if (accountDao.queryForId(acc.getAccountID()) == null) {
            accountDao.create(acc);
        }
    }

    public List<User> getAllUSer() {
        List<User> result;
        try {
            result = userDao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
            result = null;
        }
        return result;
    }


    public User getUser(int i) {
        try {
            return userDao.queryForId(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
