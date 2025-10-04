package lesson5;

public class TestCalculation {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2010);
        Calculation calc = new Calculation();
        calc.setPrice(c1);
        System.out.println(c1);
    }
}
