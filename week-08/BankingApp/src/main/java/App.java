import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Rita on 2016.12.15..
 */
public class App {
    private Dao<User, Integer> userDao;
    ArrayList<User> users;

    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://localhost:3306/bankingapp?user=root&password=R1tcsi&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        Dao<User, Integer> userDao = DaoManager.createDao(connectionSource, User.class);

        TableUtils.createTable(connectionSource, User.class);
    }

    public App() {
        users = new ArrayList<User>();
        User padme = new User("Padme", "Amidala", "Naboo planet 10");
        users.add(padme);
        User leia = new User("Leia", "Organa", "Alderaan planet 1");
        users.add(leia);
        User rey = new User("Rey", null, "Jakku planet 4");
        users.add(rey);

        for (User u : users) {
            try {
                createUserIfNotExists(userDao, u);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        padme.addAccount("C");
        padme.addAccount("S");
        padme.addAccount("M");
        leia.addAccount("C");
        leia.addAccount("S");
        rey.addAccount("C");
        rey.addAccount("M");
    }

//        public void printBankFromDatabase() {
//            for (User u : users) {
//                System.out.println(u.toString());
//            }
//        }

    private static void createUserIfNotExists(Dao<User, Integer> userDao, User usr) throws SQLException {
        if (userDao.queryForId(usr.getUserId()) == null) {
            userDao.create(usr);
        }
    }
}
