// 
import java.io.File;
// 
import java.util.Scanner; 
// 
import java.io.FileNotFoundException;

public class FileReadClass {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner scanner = new Scanner(myObj);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
            e.printStackTrace();
        }
    }
}