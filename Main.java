// Polymorphism

// superclass
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

// subclass extends superclass
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Pig extends Animal {
        public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

// create Main
class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Pig pig = new Pig();

        animal.animalSound();
        dog.animalSound();
        pig.animalSound();
    }
}
