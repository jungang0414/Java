import java.util.ArrayList;
// 
import java.util.Collections;

public class LoopArrayClass {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(20);
        nums.add(40);
        for (int i : nums) {
            System.out.println(i);
        }
        // 
        // Collections.sort(nums);   // [10, 20, 30, 40]
        // System.out.println(nums); // [10, 20, 30, 40]
        // 
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums); // [40, 30, 20, 10]
    }
}