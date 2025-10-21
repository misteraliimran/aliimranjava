package lesson10;

public class ClassRoom {
    String name;
    int studentCount;

    // Constructor
    public ClassRoom(String name, int studentCount) {
        this.name = name;
        this.studentCount = studentCount;
    }

    public void print() {
        System.out.println("Sinif: " + name + ", Şagird sayı: " + studentCount);
    }

    public static void main(String[] args) {
        ClassRoom c1 = new ClassRoom("11A", 25);
        c1.print();
    }
}
