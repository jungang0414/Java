// Abstract

// superclass
abstract class Animal {
    // abstract method
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

// supclass
class Pig extends Animal {

    public void animalSound() {
        System.out.println("wee wee");
    }
}

class AbstractClass {

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}