package lesson10;

public class CheckEvenNumber {
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Tək ədəd daxil etdiniz: " + number);
        } else {
            System.out.println("Ədəd cütdür: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            checkEven(5);
        } catch (OddNumberException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}
