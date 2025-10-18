package lesson9;

public class UniqeClass<T> {
    T value;

    UniqeClass() {
    }

    UniqeClass(T value) {
        this.value = value;
    }

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "UniqeClass value: " + value;
    }
}