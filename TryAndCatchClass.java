public class TryAndCatchClass {
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[1]);
        } catch (Exception e) {
            System.out.println("Error");
        }  finally {
            System.out.println("finally try and catch");
        }
    }
}