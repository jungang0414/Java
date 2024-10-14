import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExClass {
    public static void main(String[] args) {
        // 
        Pattern pattern = Pattern.compile("Hello", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello World!!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
