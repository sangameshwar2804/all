package codewars;

public class CreeditCard {
	public String number;
	public String name;
	public String bank;
	private double balance;
	private int limit;

	public CreeditCard(String number, String name, String bank, double balance, int limit) {
		this.number = number;
		this.name = name;
		this.bank = bank;
		this.balance = balance;
		this.limit = limit;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getBank() {
		return bank;
	}

	public double getBalance() {
		return balance;
	}

	public int getLimit() {
		return limit;
	}

	public boolean chargeIt(double price) {
		if (price + balance > (double) limit) {
			return false;
		}
		balance = balance + price;
		return true;
	}

	public void makePayement(double payment) {
		balance = balance - payment;
	}

	public static void main(String[] args) {
		CreeditCard c = new CreeditCard("12345", "abc", "icici", 10000.00, 100);
		System.out.println(c.getLimit());
		System.out.println(c.getBank());
		System.out.println(c.getBalance());
		c.makePayement(10.00);
		System.out.println(c.getNumber());
		System.out.println(c.getName());
		System.out.println(c.getBalance());
		System.out.println(c.chargeIt(110.00));
		System.out.println(c.getBalance());
	}
}
