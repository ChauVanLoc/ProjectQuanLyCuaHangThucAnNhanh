package models.person.customer;

public class ShopXu implements GatewayPayment {
	private double amount;

	public ShopXu() {
	}

	@Override
	public boolean sucessPayment(double amount) {
		if (this.amount >= amount) {
			this.amount -= amount;
			return true;
		}
		return false;
	}

	public void addMoney(double amount) {
		this.amount += amount;
	}

}
