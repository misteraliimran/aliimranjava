package lesson1;

public class MaxDigit {
    public static void main(String[] args) {
        int number = 58329;
        int max = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        }

        System.out.println("Ən böyük rəqəm: " + max);
    }
}
