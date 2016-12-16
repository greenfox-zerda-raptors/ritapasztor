import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Rita on 2016.12.15..
 */
public class App {
    public static void main(String[] args) {
        ArrayList<User> users;
        Database database = new Database();

        try {
            database.setUpDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        users = new ArrayList<User>();
        User padme = new User("Padme", "Amidala", "Naboo planet 10");
        users.add(padme);
        padme.addAccount("C");
        padme.addAccount("S");
        padme.addAccount("M");
        database.createUserIfNotExists(padme);

        User leia = new User("Leia", "Organa", "Alderaan planet 1");
        users.add(leia);

        leia.addAccount("C");
        leia.addAccount("S");
        database.createUserIfNotExists(leia);

        User rey = new User("Rey", null, "Jakku planet 4");
        users.add(rey);

        rey.addAccount("C");
        rey.addAccount("M");
        database.createUserIfNotExists(rey);
    }

    public App() {
    }

//    public void printBank() {
//        for (User u : users) {
//            System.out.println(u.toString());
//        }
//    }


}
