package lesson5;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            // Bolme
            int a = 20, b = 2;
            int result = a / b; // ArithmeticException ola biler
            System.out.println("Nəticə: " + result);

            // String index
            String text = "Hello";
            char ch = text.charAt(10); // StringIndexOutOfBoundsException ola biler
            System.out.println("Tapılan simvol: " + ch);

        } catch (ArithmeticException | StringIndexOutOfBoundsException e) {
            System.out.println("Xəta baş verdi: " + e.getClass().getSimpleName() + " -> " + e.getMessage());
        }
    }
}
