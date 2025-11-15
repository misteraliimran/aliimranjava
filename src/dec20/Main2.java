package dec20;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("2 rəqəmli ədəd daxil edin: ");
        int number = input.nextInt();

        while (number < 100) {
            number += 7;
        }

        System.out.println("Nəticə: " + number);
    }
}
