package lesson8;

public class Counter {
    synchronized void countRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}