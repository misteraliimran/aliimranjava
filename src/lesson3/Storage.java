package lesson3;

public class Storage {
    String type;
    int capacity;

    public Storage(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}