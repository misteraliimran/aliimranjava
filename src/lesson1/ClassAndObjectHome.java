package lesson1;

public class ClassAndObjectHome {

    static class Person {
        int id;
        String name;
        String surname;
        int age;
        String phone;
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.id = 1;
        p1.name = "Aliimran";
        p1.surname = "Aliyev";
        p1.age = 20;
        p1.phone = "055-123-45-67";
        
        Person p2 = new Person();
        p2.id = 2;
        p2.name = "Nermin";
        p2.surname = "Huseynova";
        p2.age = 25;
        p2.phone = "070-987-65-43";

        System.out.println("===== Person 1 =====");
        System.out.println("Id: " + p1.id);
        System.out.println("Name: " + p1.name);
        System.out.println("Surname: " + p1.surname);
        System.out.println("Age: " + p1.age);
        System.out.println("Phone: " + p1.phone);

        System.out.println("\n===== Person 2 =====");
        System.out.println("Id: " + p2.id);
        System.out.println("Name: " + p2.name);
        System.out.println("Surname: " + p2.surname);
        System.out.println("Age: " + p2.age);
        System.out.println("Phone: " + p2.phone);
    }
}
