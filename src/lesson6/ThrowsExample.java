package lesson6;

public class ThrowsExample {
    public static void riskyMethod() throws Exception {
        throw new Exception("Metod Exception atdı!");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Tutulan xəta: " + e.getMessage());
        }
    }
}