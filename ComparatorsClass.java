// import java.util.ArrayList;
// import java.util.Collections;

// class Car implements Comparable<Car> {
//     public String brand;
//     public String model;
//     public int year;

//     public Car(String b, String m, int y) {
//         brand = b;
//         model = m;
//         year = y;
//     }

//     @Override
//     public int compareTo(Car other) {
//         return this.year - other.year; // 
//     }
// }

// public class ComparatorsClass {
//     public static void main(String[] args) {
//         ArrayList<Car> myCars = new ArrayList<Car>();
//         myCars.add(new Car("BMW", "X6", 2022));
//         myCars.add(new Car("Honda", "Accord", 2007));
//         myCars.add(new Car("Ford", "Mustang", 1975));

//         Collections.sort(myCars); // 

//         for (Car c : myCars) {
//             System.out.println(c.brand + " " + c.model + " " + c.year);
//         }
//     }
// }

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

class SortByYear implements Comparator<Car> {
    @Override
    public int compare(Car a, Car b) {
        return b.year - a.year; // 
    }
}

public class ComparatorsClass {
    public static void main(String[] args) {
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X6", 2022));
        myCars.add(new Car("Honda", "Accord", 2007));
        myCars.add(new Car("Ford", "Mustang", 1975));

        Comparator<Car> myComparator = new SortByYear();
        Collections.sort(myCars, myComparator); // 

        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}