package models.person;

import java.util.Date;

import constant.Password;
import models.CustomerObserver;
import models.EmployeeObserver;
import models.Subject;

public class Person {
	private String id;
	private String cccd;
	private String name;
	private Date dateOfBirth;
	private String sex;
	private Address address;
	private String phone;
	private Account account;
	private Subject subject;

	public Person(String name, String phone, String email, String password, Subject subject, CustomerObserver cus) {
		this.name = name;
		this.phone = phone;
		this.account = new Account(email, password);
		this.subject = subject;
		this.subject.addCustomer(cus);
	}

	public Person(String cccd, String name, Date dateOfBirth, String sex, Address address, String email, String phone,
			int rule, Date expiredDate, Subject subject, EmployeeObserver emp) {
		this.cccd = cccd;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.address = address;
		this.phone = phone;
		this.account = new Account(email, Password.DEFAULT_PASSWORD, rule, expiredDate);
		this.subject = subject;
		this.subject.addEmployee(emp);
	}

	public Person() {
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Person updateInfor(String cccd, String name, Date dob, String sex, String phone, String email) {
		setCccd(cccd);
		setName(name);
		setDateOfBirth(dob);
		setSex(sex);
		setPhone(phone);
		this.account.setEmail(email);
		return this;
	}

	public int login(String email, String password) {
		return this.account.validateAccount(email, password);
	}

	public Person changePassword(String currentPassword, String newPassword) {
		if (this.getAccount().getPassword().equalsIgnoreCase(currentPassword)) {
			this.getAccount().setPassword(newPassword);
		}
		return this;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", cccd=" + cccd + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", sex="
				+ sex + ", address=" + address + ", phone=" + phone + ", account=" + account + ", subject=" + subject
				+ "]";
	}

}
