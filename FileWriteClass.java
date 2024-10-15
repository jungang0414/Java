import java.io.FileWriter;

public class FileWriteClass {
    public static void main(String[] args) {
        // 
        try {
            // 
            FileWriter myObj = new FileWriter("filename.txt");
            myObj.write("input txt txt txt");
            myObj.close();
            System.out.println("Succssful write File.");
        } catch (Exception e) {
            System.out.println("File Error.");
        }
        
    }
}