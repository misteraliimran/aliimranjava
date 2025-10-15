package lesson8;

public class Task2 {
    public static void main(String[] args) {
        Thread even = new Thread(new EvenNumbers());
        Thread odd = new Thread(new OddNumbers());
        even.start();
        odd.start();
    }
}
