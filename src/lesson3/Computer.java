package lesson3;

public class Computer {
    String name;
    Integer price;
    Storage storage;

    public Computer(String name, Integer price, Storage storage) {
        this.name = name;
        this.price = price;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}