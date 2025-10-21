package lesson10;

public class EvIsi1b {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15, 18};
        System.out.print("Cüt ədədlər: ");
        for (int num : arr) {
            if (num % 2 == 0)
                System.out.print(num + " ");
        }
    }
}
