package lesson6;

public class Test {
    public static void main(String[] args) {
        try {
            checkNumber(15);
        } catch (OutOfRangeValueException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }

    static void checkNumber(int num) throws OutOfRangeValueException {
        if (num < 0 || num > 100) {
            throw new OutOfRangeValueException("Ədəd 0 ilə 100 aralığında olmalıdır!");
        }
        System.out.println("Ədəd düzgündür: " + num);
    }
}
