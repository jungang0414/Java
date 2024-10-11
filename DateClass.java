import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateClass {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDate); // 2024-10-11
        System.out.println(myTime); // 14:46:57.251062600
        System.out.println(myDateTime); // 2024-10-11T14:49:44.757740700
    } 
}