package TodoListProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 * Created by Rita on 2016.11.17..
 */
public class App {
    public static void main(String[] args) {
       try( BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Rita\\Documents\\greenfox\\ritapasztor\\week-05\\Project\\src\\com\\greenfox\\RitaTodoList\\command.txt"))) {
           String Currentline;
           while ((Currentline = br.readLine()) !=null) {
               System.out.println(Currentline);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

//        TodoList firstList = new TodoList();
//
//        firstList.load();
//        if (input.equals("list")) {
//            firstList.displayTodoList();
//        }else {
        UserInput command = new UserInput();
        command.handleUserInput(input);
        //}




    }
}

