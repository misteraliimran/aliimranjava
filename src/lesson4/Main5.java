package lesson4;

public class Main5 {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.setBrand("Dell");
        comp.setModel("XPS 13");
        comp.setColor("Silver");
        comp.setPrice(1500);

        System.out.println(comp.getBrand() + " " + comp.getModel() + " " + comp.getColor() + " $" + comp.getPrice());
    }
}
