import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));

        capitalCities.remove("England");
        System.out.println(capitalCities);

        capitalCities.clear();
        System.out.println(capitalCities);

        System.out.println(capitalCities.size()); 
    }
}