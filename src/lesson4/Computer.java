package lesson4;

class Computer {
    private String brand;
    private String model;
    private String color;
    private double price;

    // Setterler
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setColor(String color) { this.color = color; }
    public void setPrice(double price) { this.price = price; }

    // Getterler
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
}