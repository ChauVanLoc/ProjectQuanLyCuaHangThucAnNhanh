package models.person.customer;

public class ShopXu implements GatewayPayment {
	private double amount;

	public ShopXu() {
	}

	public double getAmount() {
		return amount;
	}

	public void recharge(double amount) {
		this.amount += amount;
	}

	@Override
	public boolean pay(double amount) {
		if (this.amount >= amount) {
			this.amount -= amount;
			return true;
		}
		return false;
	}

	@Override
	public double getMoney() {
		return this.amount;
	}

}
