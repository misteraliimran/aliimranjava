package lesson10;

import java.util.ArrayList;

public class MovieList {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Inception");
        movies.add("Avatar");
        movies.add("Interstellar");
        movies.add("Titanic");

        System.out.println("Sevdiyim filmlər: " + movies);

        movies.remove("Titanic");

        System.out.println("Silindikdən sonra: " + movies);
    }
}
