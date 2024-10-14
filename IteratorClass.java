import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(11);
        nums.add(1);
        nums.add(5);
        nums.add(6);

        //
        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()) {
            Integer i = it.next();
            if (i > 10) {
                it.remove();
            }
        }

        System.out.println(nums);
    }
}