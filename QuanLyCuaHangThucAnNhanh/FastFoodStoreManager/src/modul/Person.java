package modul;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {
	private String id;
	private String cccd;
	private String name;
	private Date dateOfBirth;
	private String sex;
	private Address address;
	private String phone;
	private Account account;
	protected List<Order> orders;

	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.orders = new ArrayList<>();
	}

	public Person(String cccd, String name, Date dateOfBirth, String sex, Address address, String phone) {
		this.cccd = cccd;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.address = address;
		this.phone = phone;
		this.orders = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
