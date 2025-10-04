package lesson6;

public class Exception {
    public static void methodB() {
        int a = 10 / 0; // ArithmeticException
    }

    public static void methodA() {
        methodB(); // Exception burda ötürülür
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Xəta main-də tutuldu: " + e);
        }
    }
}
