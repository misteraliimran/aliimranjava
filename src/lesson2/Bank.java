package lesson2;

public class Bank {
	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	public void increase(double amount) {
		balance += amount;
	}

	public void decrease(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Balans kifayət etmir!");
		}
	}

	public void showBalance() {
		System.out.println("Balans: " + balance);
	}

}
