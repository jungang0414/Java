// 
package mypack;
import java.util.Scanner;

public class MyPackageClass {

    static void txt(String name) {
        System.out.println("Welcome Java. " + name);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your Name!");
        String result = myObj.nextLine();
        txt(result);
    }
}
