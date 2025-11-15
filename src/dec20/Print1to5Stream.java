package dec20;

import java.util.stream.IntStream;

public class Print1to5Stream {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5).forEach(System.out::println);
    }
}
