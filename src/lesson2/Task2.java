package lesson2;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0 && i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
