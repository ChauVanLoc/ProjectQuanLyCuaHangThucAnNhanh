package models.product;

import java.util.List;

import models.Subject;

public class Product {
	private String id;
	private String name;
	private float quantity;
	private float quantitySold;
	private float price;
	private String addressImage;
	private List<Rate> rates;
	private Subject subject;

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

	public Product(String id, String name, float quantity, float quantitySold, float price, String addressImage,
			List<Rate> rates, Subject subject) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.quantitySold = quantitySold;
		this.price = price;
		this.addressImage = addressImage;
		this.rates = rates;
		this.subject = subject;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(float quantitySold) {
		this.quantitySold = quantitySold;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAddressImage() {
		return addressImage;
	}

	public void setAddressImage(String addressImage) {
		this.addressImage = addressImage;
	}

	public List<Rate> getRates() {
		return rates;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
}
