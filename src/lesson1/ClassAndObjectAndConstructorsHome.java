package lesson1;

public class ClassAndObjectAndConstructorsHome {
	
    static class Employee {
        Integer id;
        String name;
        String surname;
        String phone;
        String address;
        int salary;

        Employee() {
            System.out.println("Default constructor işlədi");
        }
     
        Employee(String name) {
            this.name = name;
            System.out.println("Name constructor işlədi");
            System.out.println("Name: " + name);
        }

        Employee(String name, String surname) {
            this.name = name;
            this.surname = surname;
            System.out.println("Name + Surname constructor işlədi");
            System.out.println("Name: " + name + ", Surname: " + surname);
        }

        Employee(String name, String phone, int salary) {
            this.name = name;
            this.phone = phone;
            this.salary = salary;
            System.out.println("Name + Phone + Salary constructor işlədi");
            System.out.println("Name: " + name + ", Phone: " + phone + ", Salary: " + salary);
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();                       
        Employee e2 = new Employee("Ali");                  
        Employee e3 = new Employee("Nermin", "Huseynova");      
        Employee e4 = new Employee("Samir", "050-123-45-67", 800); 

        System.out.println("\n===== Employee 1 =====");
        System.out.println("Id: " + e1.id);
        System.out.println("Name: " + e1.name);
        System.out.println("Surname: " + e1.surname);
        System.out.println("Phone: " + e1.phone);
        System.out.println("Address: " + e1.address);
        System.out.println("Salary: " + e1.salary);

        System.out.println("\n===== Employee 2 =====");
        System.out.println("Id: " + e2.id);
        System.out.println("Name: " + e2.name);
        System.out.println("Surname: " + e2.surname);
        System.out.println("Phone: " + e2.phone);
        System.out.println("Address: " + e2.address);
        System.out.println("Salary: " + e2.salary);

        System.out.println("\n===== Employee 3 =====");
        System.out.println("Id: " + e3.id);
        System.out.println("Name: " + e3.name);
        System.out.println("Surname: " + e3.surname);
        System.out.println("Phone: " + e3.phone);
        System.out.println("Address: " + e3.address);
        System.out.println("Salary: " + e3.salary);

        System.out.println("\n===== Employee 4 =====");
        System.out.println("Id: " + e4.id);
        System.out.println("Name: " + e4.name);
        System.out.println("Surname: " + e4.surname);
        System.out.println("Phone: " + e4.phone);
        System.out.println("Address: " + e4.address);
        System.out.println("Salary: " + e4.salary);
    }
}
