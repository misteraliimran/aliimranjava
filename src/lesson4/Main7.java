package lesson4;

public class Main7 {
    public static void main(String[] args) {
        Person dev = new Developer("Ali", "Imran", 1000);
        Person teacher = new Teacher("Leyla", "Mammadova", 450);
        Person driver = new Driver("Rauf", "Aliyev", 600);

        Bank bank = new Bank();
        bank.credit(dev, 2000);
        bank.credit(teacher, 2000);
        bank.credit(driver, 2000);

        bank.specialCredit(dev, 5000);
        bank.specialCredit(driver, 3000);
    }
}