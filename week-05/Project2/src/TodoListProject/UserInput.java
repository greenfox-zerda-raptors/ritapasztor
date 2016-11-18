package TodoListProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Rita on 2016.11.17..
 */
public class UserInput {
    TodoList firstList = new TodoList();
//    public UserInput() {
//        handleUserInput();
//    }

    public boolean handleUserInput(String order) {
        String[] orders = order.split("\\s+", 2);

        if (order.equals("list")) {

            //firstList.load();
            firstList.displayTodoList();

        }
        if (orders[0].equals("add")) {
            if (orders.length > 1) {
                firstList.addNew(orders[1]);
                firstList.displayTodoList();
            } else {
                System.out.println("Unable to add: No task is provided");
            }
        } else if (orders.equals("remove")) {
            if (orders.length >= 1 ) {

            }
        } else if (orders.equals("complete")) {

        } else if (orders.equals("help")) {
            readHelpList();
        } else if (orders[0].equals("end")) {
            return false;
        }
        return true;
    }

    public void readHelpList() {
        try( BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Rita\\Documents\\greenfox\\ritapasztor\\week-05\\Project\\src\\com\\greenfox\\RitaTodoList\\command.txt"))) {
           String Currentline;
           while ((Currentline = br.readLine()) !=null) {
               System.out.println(Currentline);
           }
        }catch (IOException e) {
           e.printStackTrace();
       }
    }
}
