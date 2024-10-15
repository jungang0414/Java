// import java.util.ArrayList;

// public class LambdaClass {
//     public static void main(String[] args) {
//         ArrayList<Integer> nums = new ArrayList<Integer>();
//         nums.add(10);
//         nums.add(20);
//         nums.add(30);
//         nums.add(40);
//         nums.add(50);

//         for (int i=0; i < nums.size(); i++) {
//             int num = nums.get(i);
//             System.out.println(num);
//         }
//     }
// }


import java.util.ArrayList;

public class LambdaClass {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        nums.forEach( n -> System.out.println(n));
    }
}
