package managementStore;

import java.sql.Date;
import java.util.List;

public class Product {
	private String id;
	private String name; 
	private float quantity;
	private float quantitySold;
	private float price;
	private String addressImage;
	private String description;
	private List<Rate> rates;
	private Date expirationDate; // ngày hết hạn
	private Subject subject;
	
	public Product(String id, String name, float quantity, float quantitySold, float price, String addressImage,
			String description, List<Rate> rates,Date expirationDate,  Subject subject) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.quantitySold = quantitySold;
		this.price = price;
		this.addressImage = addressImage;
		this.description = description;
		this.rates = rates;
		this.expirationDate = expirationDate;
		this.subject = subject;
	}

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
	
	public Date getExpirationDate() {
		return expirationDate;
	}
	
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
}
