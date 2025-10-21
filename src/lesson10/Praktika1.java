package lesson10;

import java.util.ArrayList;

public class Praktika1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Ədədlərin cəmi: " + sum);
    }
}
