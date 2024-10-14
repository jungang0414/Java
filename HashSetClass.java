import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars); // [Volvo, Mazda, Ford, BMW]

        System.out.println(cars.contains("BMW"));

        //
        cars.remove("BMW");
        System.out.println(cars); // [Volvo, Mazda, Ford]

        //
        cars.clear();
        System.out.println(cars); // []

        //
        System.out.println(cars.size()); // 0

        HashSet<Integer> nums = new HashSet<Integer>();
        nums.add(0);
        nums.add(7);
        nums.add(3);
        nums.add(11);
        
        for (int i = 1; i <= 10; i++) {
            if (nums.contains(i)) {
                System.out.println(i + " in the nums set");
            } else {
                System.out.println(i + " not in the nums set");
            }
        }
    }
}