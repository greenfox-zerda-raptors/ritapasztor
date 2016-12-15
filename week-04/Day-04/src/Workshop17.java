/**
 * Created by Rita on 2016.11.11..
 */
import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class Workshop17 {
    public static String basePath = "C:\\Users\\Rita\\Documents\\greenfox\\ritapasztor\\week-04\\Day-04";
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dear user, enter a file name");
            File source = loadFile(scanner);
            if (source == null) {
                return; //End of program, because User said "blank" for file name
            }
            System.out.println("Dear User, pleas enter a destination file name,assuming the same path:" + basePath);
            String filenameDestination = scanner.next();
            System.out.println("We're copying from" + source.getPath() + "to" + basePath + filenameDestination + ", confirm with a Y or N to abort/" +
                    ".");
            File destination = new File(basePath + filenameDestination);
            if (destination.exists()){
                destination.createNewFile();
            }
            BufferedReader reader = new BufferedReader( new FileReader(source));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
            String line = reader.readLine();
            int length = line.length();
            while (line != null){
                writer.write(line);
                writer.newLine();
                line = reader.readLine();
                if (line != null) {
                    length += line.length();
                }
            }
            reader.close();
            writer.close();
            System.out.println("we're done.");

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static File loadFile(Scanner scanner){
        String filenameSource = scanner.next();
        File source = new File(basePath + filenameSource);
        if (source.exists()) {
           return source;
        }else {
            System.out.println("Sorry, this file doesnt exist, try again, or blank to exit");
            return loadFile(scanner);
        }
    }
    // get the directory
    // get the names & confirm the source is okay and if the target exists ignore error (if already exists)
    // confirm action
    // confirm
    // read/write and count
    // report

}
