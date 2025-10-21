package lesson10;

import java.util.*;

public class ArrayListToSet {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Ali");
        names.add("Ramil");
        names.add("Veli");

        System.out.println("ArrayList: " + names);

        Set<String> uniqueNames = new HashSet<>(names);

        System.out.println("Set (təkrarsız): " + uniqueNames);
    }
}
