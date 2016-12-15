/**
 * Created by Rita on 2016.11.10..
 */
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Workshop13 {
    static File randomDir; //kell ahhoz, h objectet csinalhassak belole majd
    public static void main(String[] args) {

        System.out.println("Please provide an absolute path and I will list the contents of it! (Type 'q' to quit)");

        Scanner userInput = new Scanner(System.in);

        String pathToList;

        System.out.print("Path: ");

        while(userInput.hasNextLine()){ //addig megy a loop amig van next line, a scannerben mindig lesz next line, amig ki nem lepsz belole
            pathToList = userInput.nextLine();
            if(pathToList.equals("q"))
                break;
            printDirectoryContents(pathToList);
            System.out.print("Path: ");
        }
    }

    private static void printDirectoryContents(String pathToList) {
        randomDir = new File(pathToList); //objectet csinalok belole, hogy methodot hasznaljak hozza
        String[] filesInDir = randomDir.list();

        System.out.println("Files in Random Directory\n");
        for(String fileName : filesInDir){
        System.out.println(fileName + "\n");
        }

        // Implement this function
        // List all files and directories at the specified path
        // If a specified path does not exist write "The specified path does not exists!"
        // If a specified path is a file and not a directory then list all the contents of the specified file's parent
        // directory (example: input is c:\myfolder\myfile.txt then the function should list contents of c:\myfolder\
    }
}
