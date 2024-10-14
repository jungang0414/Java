import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        // ArrayList<int> nums = new ArrayList<int>(); // error
        ArrayList<Integer> nums = new ArrayList<Integer>();

        System.out.println(nums);

        // int num = 5;
        Integer num = 5;
        System.out.println(num.intValue()); // 5
    }
}