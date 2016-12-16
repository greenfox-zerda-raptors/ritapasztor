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
        
        User hanSolo = database.getUser(1);

        users = new ArrayList<User>();
        User padme = new User("Padme", "Amidala", "Naboo planet 10");
        users.add(padme);
        User leia = new User("Leia", "Organa", "Alderaan planet 1");
        users.add(leia);
        User rey = new User("Rey", null, "Jakku planet 4");
        users.add(rey);

        padme.addAccount("C");
        padme.addAccount("S");
        padme.addAccount("M");
        leia.addAccount("C");
        leia.addAccount("S");
        rey.addAccount("C");
        rey.addAccount("M");

        for (User u : users) {
            try {
                database.createUserIfNotExists(u);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public App() {
    }

//    public void printBank() {
//        for (User u : users) {
//            System.out.println(u.toString());
//        }
//    }


}
