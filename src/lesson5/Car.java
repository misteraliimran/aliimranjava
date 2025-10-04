package lesson5;

class Car {
    String model;
    int year;
    double price;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", İl: " + year + ", Qiymət: " + price;
    }
}