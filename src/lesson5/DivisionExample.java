package lesson5;

public class DivisionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0; // sifira bolmek ucun
            int result = a / b; // burada ArithmeticException atilacaq
            System.out.println("Nəticə: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Sıfıra bölmək olmaz! " + e.getMessage());
        } finally {
            System.out.println("Programın sonu (finally işlədi).");
        }
    }
}
