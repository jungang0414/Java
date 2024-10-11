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
        Collections.sort(nums);
        System.out.println(nums);
    }
}