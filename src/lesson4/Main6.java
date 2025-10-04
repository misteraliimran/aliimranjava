package lesson4;

public class Main6 {
    public static void main(String[] args) {
        int num = 1; // baslangic eded
        while (true) {
            if (num % 9 == 0 && num % 10 == 5) {
                System.out.println("Dayandı: " + num);
                break;
            }
            num++;
        }
    }
}
