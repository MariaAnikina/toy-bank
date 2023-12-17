import java.util.List;

public class Bank {
	private double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public synchronized void increaseBalance(double amountMoney, String name, Request request) {
		balance += amountMoney;
		printConsole(name, request);
	}

	public synchronized void reduceBalance(double amountMoney, String name, Request request) {
		if (balance >= amountMoney) {
			balance -= amountMoney;
			printConsole(name, request);
		}
	}

	private void printConsole(String name, Request request) {
		System.out.println("Заявка " + request.toString() +
				" успешно выполнена. Получена от обработчика " + name +
				". Баланс банка: " + balance);
	}
}
