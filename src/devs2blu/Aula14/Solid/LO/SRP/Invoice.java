package devs2blu.Aula14.Solid.LO.SRP;

public class Invoice {
	private double amount;

	public Invoice(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
