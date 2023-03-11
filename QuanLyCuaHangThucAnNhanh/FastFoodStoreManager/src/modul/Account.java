package modul;

import java.util.Date;

import constant.Rule;

public abstract class Account {
	private String email;
	private String password;
	private boolean status; // trạng thái true (sử dụng), false (khóa tài khoản)
	private int rule;
	private Date createdDate;
	private Date expireDate; // nếu là customer thì bằng null còn nhân viên thì có ngày hết hợp đồng

	// constructor này vừa tạo account vừa tạo thông tin cá nhân khách hàng
	public Account(String email, String password, String phone) {
		// mặc định ban đầu khách hàng luôn là regular
		new RegularCustomer(password, phone);
		this.email = email;
		this.password = password;
		this.status = true;
		this.rule = Rule.getCustomer();
		this.createdDate = new Date();
		this.expireDate = null;
	}

	// constructor này vừa tạo account cho nhân viên
	public Account(String email, String password, int rule, Date expireDate) {
		this.email = email;
		this.password = password;
		this.status = true;
		this.rule = rule;
		this.createdDate = new Date();
		this.expireDate = expireDate;
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

}
