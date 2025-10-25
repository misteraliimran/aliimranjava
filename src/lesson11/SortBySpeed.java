package lesson11;

import java.util.Comparator;

public class SortBySpeed implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return Integer.compare(c1.speed, c2.speed);
    }
}


