// protected
class Animal {
    protected String name = "bingo";
    public void eat() {
        System.out.println("can eat!");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("can bark!");
    }

    public static void main(String[] args) {
        Dog myObj = new Dog();
        System.out.println(myObj.name);
        myObj.eat();
        myObj.bark();
    }
}