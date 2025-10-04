package lesson2;

public class Animal {
    // private deyisenler
    private String name;
    private int age;

    // Konstructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Melumatlari cap eden metod
    public void showInfo() {
        System.out.println("Ad: " + name + ", Yaş: " + age);
    }
}

