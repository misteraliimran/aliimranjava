package lesson11;

import java.util.*;

public class RemoveNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Ramil");
        names.add("Anar");
        names.add("Nigar");
        names.add("Aysel");

        System.out.println("Əvvəl:");
        System.out.println(names);

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("A")) {
                it.remove();
            }
        }

        System.out.println("\n\"A\" ilə başlayanlar silindikdən sonra:");
        System.out.println(names);
    }
}
