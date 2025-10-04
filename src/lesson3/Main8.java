package lesson3;

import lesson3.Student.Address;

public class Main8 {
    public static void main(String[] args) {
        Student student = new Student("Ali", 20);
        Student.Address address = student.new Address("Baku", "Nizami street");

        student.printInfo(address);
    }
}

