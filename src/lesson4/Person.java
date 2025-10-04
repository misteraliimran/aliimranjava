package lesson4;

public class Person {
    String name;
    String surname;
    double salary;

    Person(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
}

class Developer extends Person {
    Developer(String name, String surname, double salary) {
        super(name, surname, salary);
    }
}

class Teacher extends Person {
    Teacher(String name, String surname, double salary) {
        super(name, surname, salary);
    }
}

class Driver extends Person {
    Driver(String name, String surname, double salary) {
        super(name, surname, salary);
    }
}

interface CreditAble {
    void credit(Person p, double amount);
    void specialCredit(Person p, double amount);
}

class Bank implements CreditAble {
    public void credit(Person p, double amount) {
        if (p.salary > 500) {
            System.out.println(p.name + " " + p.surname + " üçün " + amount + " kredit təsdiqləndi.");
        } else {
            System.out.println(p.name + " " + p.surname + " üçün kredit rədd edildi.");
        }
    }

    public void specialCredit(Person p, double amount) {
        if (p instanceof Developer) {
            System.out.println("Developer " + p.name + " üçün xüsusi " + amount + " kredit təsdiqləndi.");
        } else {
            System.out.println(p.name + " xüsusi kredit ala bilməz.");
        }
    }
}
