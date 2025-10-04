package lesson3;

class Student {
    String name;
    int age;

    class Address {
        String city;
        String street;

        public Address(String city, String street) {
            this.city = city;
            this.street = street;
        }

        public String fullAddress() {
            return city + ", " + street;
        }
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(Address address) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address.fullAddress());
    }
}