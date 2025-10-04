package lesson4;

interface Flyable {
    void fly_obj();
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter havada uçur.");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane səmada uçur.");
    }
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft kosmosa uçur.");
    }
}