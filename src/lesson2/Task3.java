package lesson2;

public class Task3 {
    public static void main(String[] args) {
        Person.city = "Bakı"; // static deyisen yalniz bir defe teyin olunur

        Person p1 = new Person("Əli", "İmranov");
        Person p2 = new Person("Nigar", "Həsənova");
        Person p3 = new Person("Murad", "Əliyev");

        p1.showInfo();
        p2.showInfo();
        p3.showInfo();
    }
}
