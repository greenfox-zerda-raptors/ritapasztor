import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rita on 2016.12.14..
 */
public class Workshop02 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://localhost:3306/workshop02?user=root&password=R1tcsi&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

        Account account = new Account("Captain America", "uejnsd632**234.");
        createAccountIfNotExists(accountDao, account);

        account = accountDao.queryForId("Captain America");
        System.out.println("Account: " + account.toString());

        ArrayList<Account> accountNames = new ArrayList<>();
        accountNames.add(new Account("Iron Man", "1231"));
        accountNames.add(new Account("Wolverine", "1232"));
        accountNames.add(new Account("Hulk", "1233"));
        accountNames.add(new Account("Loki", "1234"));

        for (Account hero : accountNames) {
            createAccountIfNotExists(accountDao, hero);
        }

        try {
            QueryBuilder<Account, String> queryBuilder = accountDao.queryBuilder();
            System.out.println(accountDao.queryForAll());
            List<Account> accountList = accountDao.queryBuilder().orderBy("name", true).query();
            for (Account acc : accountList) {
                System.out.println(acc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if (accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}
