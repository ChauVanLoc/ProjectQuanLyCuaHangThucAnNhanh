package managementStore;

import java.sql.Date;
import java.util.List;

public class Order {
	private String nameStaff;
	private String nameCustomer;
	private String phone;
	private List<ProductObserver> products;
	private String payment;
	private String deliveryAddress;
	private boolean status;
	private Date createDate;
	private Subject subject;

	public Order(String nameStaff, String nameCustomer, String phone, List<ProductObserver> products, String payment,
			String deliveryAddress, boolean status, Date createDate, Subject subject) {
		super();
		this.nameStaff = nameStaff;
		this.nameCustomer = nameCustomer;
		this.phone = phone;
		this.products = products;
		this.payment = payment;
		this.deliveryAddress = deliveryAddress;
		this.status = status;
		this.createDate = createDate;
		this.subject = subject;
	}

	public String getNameStaff() {
		return nameStaff;
	}

	public void setNameStaff(String nameStaff) {
		this.nameStaff = nameStaff;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<ProductObserver> getProducts() {
		return products;
	}

	public void setProducts(List<ProductObserver> products) {
		this.products = products;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
