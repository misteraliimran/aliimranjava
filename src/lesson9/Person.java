package lesson9;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

// 1. Person sinifi
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }}