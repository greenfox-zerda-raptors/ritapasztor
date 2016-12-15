/**
 * Created by Rita on 2016.11.10..
 */
import java.io.*;
public class Workshop12 {
    static String filePath,parentDirectory;

    static File randomDir, randomFile, randomFile2; //pointer, azert kell, hogy a Java tudja ay objektek helyet

    public static void main(String[] args){

        String strDirectoryPath = "C:\\Users\\Rita\\Documents\\greenfox\\ritapasztor\\week-04\\Day-04";
        String strFileName = "random";
        String strExtension = ".txt";

        // Creates a File object in memory
        randomDir = new File(strDirectoryPath); //catch the "memory" bit... nothing has happened YET

        // Make a directory
        randomDir.mkdir(); //now it happens

        // Make a file named random.txt
        randomFile = new File(strFileName + strExtension);

        // Make a file and define where to save it in the file system
        randomFile2 = new File(strDirectoryPath + "/" + strFileName + strExtension);

        // createNewFile and getCanonicalPath have to be called in
        // a try block to catch IOException
        try {

            // createNewFile creates the file in the file system
            randomFile.createNewFile();
            randomFile2.createNewFile();

            // Returns the path for the file
            filePath = randomFile.getCanonicalPath();  // we need this as for the first file we didnt say where

        } catch (IOException e) {                  // You have to catch the IOException
            e.printStackTrace();  // keep it simple and it'll explain it all
        }

        // Check to see if the file exists in the current directory
        if (randomFile.exists()){
            System.out.println("File Exists");
            System.out.println("File is readable: " + randomFile.canRead());
            System.out.println("File is writable: " + randomFile.canWrite());
            System.out.println("File location: " + filePath);
            System.out.println("File name: " + randomFile.getName());

            // Since you created the file without defining a path this returns null
            System.out.println("Parent directory: " + randomFile.getParent());

            // This returns the parent because it was defined
            parentDirectory = randomFile2.getParent();
            System.out.println("File Two Parent Directory: " + parentDirectory);
            System.out.println("Is this a directory: " + randomDir.isDirectory());

            // list provides a string array containing all the files
            String[] filesInDir = randomDir.list();
            System.out.println("Files in Random Directory\n");
            // Use the enhanced for loop to cycle through the files
            for(String fileName : filesInDir){
                System.out.println(fileName + "\n");
            }


            System.out.println("Is this a file: " + randomFile.isFile());
            System.out.println("Is this hidden: " + randomFile.isHidden());

            System.out.println("Last modified: " + randomFile.lastModified());   // Milliseconds since Jan 1, 1970 when modified
            System.out.println("Size of file: " + randomFile.length());          // Return size of file

            // Changes the name of the file

            randomFile2.renameTo(new File(strDirectoryPath + "/" + strFileName + "2" + strExtension ));
            // Output the full path for the file unless the path wasn't defined when the File was created
            System.out.println("New Name: " + randomFile2.toString());

        } else {

            System.out.println("File Doesn't Exist");

        }

        System.out.println("Will list (delete) the files in " + randomDir.getPath());
        File[] filesInDir = randomDir.listFiles();

        for(File fileName : filesInDir) {
            fileName.toString();
        };

/**  ONLY DO THIS ONCE YOU ARE 100% SURE that the variables are pointing to the test files!!!
 *
 // You call delete to delete a file
 if(randomFile.delete()){  //this will be the file written to the current directory
 System.out.println("File Deleted");
 }
 // I could get an array of File objects from the directory
 File[] filesInDir = randomDir.listFiles();
 for(File fileName : filesInDir){
 fileName.delete();
 }
 // You can only delete a directory if it is empty
 if(randomDir.delete()){
 System.out.println("Directory Deleted");
 }
 **/

    }
}
