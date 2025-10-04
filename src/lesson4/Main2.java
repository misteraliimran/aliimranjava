package lesson4;

public class Main2 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.name = "Bunny";
        rabbit.surname = "White";
        rabbit.color = "Gray";
        rabbit.length = 3;

        Dog dog = new Dog();
        dog.name = "Max";
        dog.surname = "Brown";
        dog.color = "Black";
        dog.speed = 40;

        System.out.println("Rabbit: " + rabbit.name + " " + rabbit.surname + ", Color: " + rabbit.color + ", Jump: " + rabbit.length + "m");
        System.out.println("Dog: " + dog.name + " " + dog.surname + ", Color: " + dog.color + ", Speed: " + dog.speed + "km/h");
    }
}
