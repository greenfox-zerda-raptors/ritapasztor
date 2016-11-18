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

        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
        UserInput command = new UserInput();
        command.readHelpList();
        while (command.handleUserInput(scan.nextLine())) {
        }
//        command.handleUserInput(input);





    }
}

