package lesson1;

public class PrintWithDecimalStep {
    public static void main(String[] args) {
        for (double i = 0; i <= 5; i += 0.1) {
            System.out.printf("%.1f\n", i);
        }
    }
}
