package lesson2;

public class Car {
	String brand;
	String model;
	double price;

	public Car(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Brand: " + brand + ", Model: " + model + ", Price: " + price;
	}

	}
