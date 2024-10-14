public class ThrowClass {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("must be at least 18 years old");
        }
        else {
            System.out.println("old enough");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}