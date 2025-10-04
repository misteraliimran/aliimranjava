package lesson3;

public class Main7 {
    public static void main(String[] args) {
        Storage ssd = new Storage("SSD", 512);
        Storage hdd = new Storage("HDD", 1000);

        Computer comp1 = new Computer("Asus", 1500, ssd);
        Computer comp2 = new Computer("Dell", 2000, hdd);

        System.out.println(comp1);
        System.out.println(comp2);
    }
}