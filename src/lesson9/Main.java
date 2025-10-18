package lesson9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // 2. Person sinifindən 5 obyekt yaradın və Listə əlavə edin
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ali", 20));
        people.add(new Person("Leyla", 25));
        people.add(new Person("Murad", 30));
        people.add(new Person("Aygün", 27));
        people.add(new Person("Ramil", 22));
        System.out.println("Person list: " + people);

        // 3. Integer list yaradın, 2 element silin
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        numbers.remove(1); // 20 silinir
        numbers.remove(2); // 40 silinir (çünki index dəyişir)
        System.out.println("Integer list: " + numbers);
        System.out.println("List ölçüsü: " + numbers.size());

        // 4. HashSet və TreeSet
        HashSet<String> names = new HashSet<>();
        names.add("Ali");
        names.add("Leyla");
        names.add("Murad");
        names.add("Ali"); // təkrar olunmur
        System.out.println("HashSet: " + names);

        TreeSet<Integer> treeNumbers = new TreeSet<>();
        treeNumbers.add(5);
        treeNumbers.add(2);
        treeNumbers.add(8);
        treeNumbers.add(1);
        System.out.println("TreeSet: " + treeNumbers);

        // 5. UniqeClass-dan 3 obyekt
        UniqeClass<String> u1 = new UniqeClass<>("Salam");
        UniqeClass<Integer> u2 = new UniqeClass<>();
        u2.setValue(123);
        UniqeClass<Double> u3 = new UniqeClass<>(99.99);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        // 6. TypeClass-dan 3 obyekt
        TypeClass<String, Integer> t1 = new TypeClass<>("Yaş", 25);
        TypeClass<Double, String> t2 = new TypeClass<>(12.5, "metr");
        TypeClass<Boolean, String> t3 = new TypeClass<>(true, "aktiv");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        // 7. User sinifi və yaş yoxlaması
        try {
            User user1 = new User("Aysel", "Hüseynova", LocalDate.of(2000, 5, 10)); // 18-dən böyük
            System.out.println(user1);
            User user2 = new User("Nicat", "Əliyev", LocalDate.of(2010, 3, 15)); // 18-dən kiçik
            System.out.println(user2);
        } catch (UnderAgeException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}
