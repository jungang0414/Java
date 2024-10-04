public class Cars {
    // 
    int tire = 4;
    int engine = 1;
    int wheel = 1;
    public static void main(String[] args) {
        Cars toyota = new Cars();
        Cars audi = new Cars();
        Cars volvo = new Cars();
        volvo.engine = 2;
        System.out.println(toyota.tire);  // 4
        System.out.println(audi.engine);  // 1
        System.out.println(volvo.engine); // 2
        System.out.println(volvo.wheel);  // 1
    }
}