package lesson2;

import lesson3.Animal;

public class Main5 {
    public static void main(String[] args) {
        // Obyekt yaradilir
        Animal animal1 = new Animal("Aslan", 5);
        Animal animal2 = new Animal("Fil", 10);

        // Metod cagirılir
        animal1.showInfo();
        animal2.showInfo();
    }
}