package lesson4;

public class Main3 {
    public static void main(String[] args) {
        Flyable h = new Helicopter();
        Flyable a = new Airplane();
        Flyable s = new Spacecraft();

        h.fly_obj();
        a.fly_obj();
        s.fly_obj();
    }
}
