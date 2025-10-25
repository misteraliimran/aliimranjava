package lesson11;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 990));
        cars.add(new Car("Mercedes", 240));
        cars.add(new Car("Toyota", 200));
        cars.add(new Car("Audi", 230));

        System.out.println("Sıralamadan əvvəl:");
        for (Car c : cars) {
            System.out.println(c);
        }

        Collections.sort(cars, new SortBySpeed());

        System.out.println("\nSürətə görə sıralandıqdan sonra:");
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}