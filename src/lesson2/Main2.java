package lesson2;

public class Main2 {
	public static void main(String[] args) {
		Bank bank = new Bank(1000);

		bank.showBalance();
		bank.increase(500);
		bank.showBalance();
		bank.decrease(200);
		bank.showBalance();
		bank.decrease(2000); // kifayət etmir
	}
}