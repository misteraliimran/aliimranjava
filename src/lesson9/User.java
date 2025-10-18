package lesson9;

import java.time.LocalDate;
import java.time.Period;

public class User {
    String name;
    String surname;
    LocalDate birthDate;

    User(String name, String surname, LocalDate birthDate) throws UnderAgeException {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;

        int age = Period.between(birthDate, LocalDate.now()).getYears();
        if (age < 18) {
            throw new UnderAgeException("Yaş " + age + " - 18-dən kiçikdir!");
        }
    }

    @Override
    public String toString() {
        int age = Period.between(birthDate, LocalDate.now()).getYears();
        return name + " " + surname + " (" + age + " yaş)";
    }
}
