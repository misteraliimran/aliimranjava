package lesson8;

public class Parrot extends Bird {
    String type;
    int age;

    public Parrot(String name, String color, String type, int age) {
        super(name, color);
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Type: " + type + ", Age: " + age;
    }

    public static void main(String[] args) {
        Parrot p = new Parrot("Kiko", "Green", "Tropical", 3);
        System.out.println(p.toString());
    }
}
