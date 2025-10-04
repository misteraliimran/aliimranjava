package lesson2;

class Person {
    String name;
    String surname;
    static String city; // butun obyektler uçun ortaq deyisen

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname + ", City: " + city);
    }
}