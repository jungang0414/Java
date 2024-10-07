// Modifiers
abstract class Main {
    public String fname = "John";
    public int age = 24;
    // abstract
    public abstract void study();
}

class Student extends Main {
    public int year = 2000;
    public void study() {
        System.out.println("Studying");
    }
}