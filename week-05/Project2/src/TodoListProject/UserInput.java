package TodoListProject;

import java.util.Scanner;

/**
 * Created by Rita on 2016.11.17..
 */
public class UserInput {

//    public UserInput() {
//        handleUserInput();
//    }

    public void handleUserInput(String order) {
        String[] orders = order.split("\\s+", 2);
        String instruction;
        TodoList firstList = new TodoList();

        firstList.load();
        if (order.equals("list")) {
            firstList.displayTodoList();
        }
//        if (order.contains("add") && order.startsWith("a",0)) {
//            String[] a = order.split("\\s+");
//            String b = a[1];
//            TodoList.addNew(b);
//        }
        if (orders[0].equals("add")) {
            if (orders.length > 1) {
                firstList.addNew(orders[1]);
            }
        }

    }
}
