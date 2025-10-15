package lesson8;

import java.time.LocalDateTime;

public class User {
    private String name;
    private String surname;
    private int age;
    private String address;
    private LocalDateTime created_date;

    public void create(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.created_date = LocalDateTime.now(); // yaranma vaxtı
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Created: " + created_date);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        User u1 = new User();
        u1.create("Ali", "Imran", 20, "Baku");
        u1.showInfo();

        User u2 = new User();
        u2.create("Nigar", "Aliyeva", 22, "Ganja");
        u2.showInfo();
    }
}
