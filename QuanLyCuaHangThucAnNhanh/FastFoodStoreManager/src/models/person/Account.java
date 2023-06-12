package models.person;

import java.util.Date;

import constant.Rule;

public class Account {
	private String email;
	private String password;
	private boolean status;
	private int rule;
	private Date createdDate;
	private Date expireDate;

	public Account(String email, String password) {
		this.email = email;
		this.password = password;
		this.status = true;
		this.rule = Rule.NEW_CUSTOMER;
		this.createdDate = new Date();
		this.expireDate = null;
	}

	public Account(String email, String password, int rule, Date expireDate) {
		this.email = email;
		this.password = password;
		this.status = true;
		this.rule = rule;
		this.createdDate = new Date();
		this.expireDate = expireDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return email;
	}

	public void setUserName(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getRule() {
		return rule;
	}

	public void setRule(int rule) {
		this.rule = rule;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public boolean checkFormatEmail(String email) {
		return true;
	}

	public boolean checkFormatPassword(String password) {
		return true;
	}

	public int validateAccount(String email, String password) {
		if (checkFormatEmail(email) && checkFormatPassword(password)) {
			if (this.email.equals(email) && this.password.equals(password)) {
				return this.rule;
			}
		}
		return Rule.UNAUTHORIZED;
	}

}
