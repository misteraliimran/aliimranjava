package lesson5;

public class ThrowExample {
    public static void checkNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Ədəd mənfi ola bilməz: " + num);
        } else {
            System.out.println("Ədəd düzgündür: " + num);
        }
    }

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10); // Exception atacaq
    }
}
