enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class EnumsClass {
    public static void main(String[] args) {
        // access Level
        Level myVar = Level.LOW;
        
        // Switch
        switch (myVar) {
            case LOW:
                System.out.println("Is LOW");
                break;
            case MEDIUM:
                System.out.println("Is MEDIUM");
            case HIGH:
                System.out.println("Is HIGH");
        }
    }
}