package dec20;

public class PrimitiveTypeConversionHome {
    public static void main(String[] args) {

        int num1 = 55;
        byte b1 = (byte) num1;
        System.out.println("1) int -> byte: " + b1);
        
        short s1 = 636;
        byte b2 = (byte) s1;
        System.out.println("2) short -> byte: " + b2);

        long l1 = 458L;
        short s2 = (short) l1;
        System.out.println("3) long -> short: " + s2);
        
        long l2 = 92523635483L;
        int i1 = (int) l2; 
        System.out.println("4) long -> int: " + i1);

        double d1 = 65787.3;
        int i2 = (int) d1;
        System.out.println("5) double -> int: " + i2);

        char c1 = 'q';
        int i3 = (int) c1;
        System.out.println("6) char -> int: " + i3);

        int i4 = 266;
        char c2 = (char) i4;
        System.out.println("7) int -> char: " + c2);

        System.out.println("\nBütün tip çevirmələri uğurla yerinə yetirildi!");
    }
}
