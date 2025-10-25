package lesson11;

import java.util.ArrayList;
import java.util.Collections;

public class ProductSort {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Telefon", 1200));
        products.add(new Product("Noutbuk", 2200));
        products.add(new Product("Saat", 500));
        products.add(new Product("Qulaqlıq", 150));

        System.out.println("Sıralamadan əvvəl:");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products);

        System.out.println("\nQiymətə görə sıralandıqdan sonra:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}