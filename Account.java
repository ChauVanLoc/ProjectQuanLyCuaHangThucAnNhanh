package managementStore;

import java.util.Date;

public class Account {
	private String email;
	private String password;
	private boolean status;
	private int rule;
	private Date createdDate;
	private Date expiredDate;

	public Account(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		this.status = false;
		this.getRule();
		this.getCreatedDate();
		this.getExpiredDate();
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

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

}
