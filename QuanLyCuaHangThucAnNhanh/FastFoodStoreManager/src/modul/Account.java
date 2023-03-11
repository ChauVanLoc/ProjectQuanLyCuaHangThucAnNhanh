package modul;

import java.util.Date;

public class Account {
	private String email;
	private String password;
	private boolean status; // trạng thái true (sử dụng), false (khóa tài khoản)
	private Date createdDate;

	public Account(String email, String password) {
		this.email = email;
		this.password = password;
		this.status = true;
		this.createdDate = new Date();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
