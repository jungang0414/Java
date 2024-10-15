import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        // 
        try {
            // 
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("File Error.");
        }
        
    }
}