import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        // 
        ArrayList<String> cars = new ArrayList<String>();
        // 
        cars.add("one");
        cars.add("two");
        System.out.println(cars); // [one, two]
        cars.add(0, "true one");
        System.out.println(cars); // [true one, one, two]
        // get
        String mycar = cars.get(0);
        System.out.println(mycar);
        // change
        cars.set(0, "true");
        System.out.println(cars);
        // delect
        cars.remove(0);
        System.out.println(cars); // [one, two]
        // delect all
        cars.clear();
        System.out.println(cars); // []
        // Array size
        cars.add("one");
        System.out.println(cars.size());  // 1
    }
}


