package lesson1;

public class Methods {

    void printName(int count, String name) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        Methods obj = new Methods();

        obj.printName(3, "Ali");
        obj.printName(2, "Imran");
        obj.printName(5, "Java");
    }
}
