package managementStore;

import java.sql.Date;

public class Rate {
	private String id;
	private String appearance;
	private String quantity;
	private String details;
	private Date createdDate;

	public Rate(String id, String appearance, String quantity, String details, Date createdDate) {
		super();
		this.id = id;
		this.appearance = appearance;
		this.quantity = quantity;
		this.details = details;
		this.createdDate = createdDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
