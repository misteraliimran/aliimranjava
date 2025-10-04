package lesson5;

public class MultiCatchNumber {
    public static void main(String[] args) {
        try {
            String input = "abc"; // sehv eded
            int number = Integer.parseInt(input); // NumberFormatException

            int result = 10 / number; // ArithmeticException ola biler
            System.out.println("Nəticə: " + result);

        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Xəta: " + e.getClass().getSimpleName() + " -> " + e.getMessage());
        }
    }
}
