package models.product;

import java.util.List;

import models.Subject;

public class Product {
	private String id;
	private String name;
	private int quantity;
	private int quantitySold;
	private double price;
	private String addressImage;
	private String description;
	private List<Rate> rates;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product() {
		super();
	}

	public Product(String id, String name, int quantity, double price, String addressImage, String description) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.addressImage = addressImage;
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddressImage() {
		return addressImage;
	}

	public void setAddressImage(String addressImage) {
		this.addressImage = addressImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Rate> getRates() {
		return rates;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}

	public void increaseAmount(int amount) {
		setQuantity(getQuantity() + amount);
	}

	public void decreaseAmount(int amount) {
		setQuantity(getQuantity() - amount);
	}

	public void update(String id, String name, int quantity, int quantitySold, double price, String addressImage,
			String description) {
		setId(id);
		setName(name);
		setQuantity(quantity);
		setQuantitySold(quantitySold);
		setPrice(price);
		setAddressImage(addressImage);
		setDescription(description);
	}
}
