package lesson1;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 583;
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Rəqəmlərin cəmi: " + sum);
    }
}
