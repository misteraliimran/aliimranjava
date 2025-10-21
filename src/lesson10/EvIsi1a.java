package lesson10;

public class EvIsi1a {
    public static void main(String[] args) {
        int[] arr = {4, 8, 12, 16};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;
        System.out.println("Ortalama: " + average);
    }
}
