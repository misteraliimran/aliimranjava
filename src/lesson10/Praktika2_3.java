package lesson10;

public class Praktika2_3 {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 2, 15, 7};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Ən böyük ədəd: " + max);
    }
}
