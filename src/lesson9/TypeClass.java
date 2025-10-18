package lesson9;

public class TypeClass<T, U> {
    T first;
    U second;

    TypeClass(T first, U second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TypeClass [first=" + first + ", second=" + second + "]";
    }
}