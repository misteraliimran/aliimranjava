package lesson1;

public class MinDigit {
    public static void main(String[] args) {
        int number = 58329;
        int min = 9;

        while (number > 0) {
            int digit = number % 10;
            if (digit < min) {
                min = digit;
            }
            number /= 10;
        }

        System.out.println("Ən kiçik rəqəm: " + min);
    }
}
