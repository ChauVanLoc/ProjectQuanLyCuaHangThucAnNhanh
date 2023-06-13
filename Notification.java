package managementStore;

import java.util.ArrayList;
import java.util.Date;


public class Notification {
	private String id;
	private String title;
	private String type;
	private String content;
	private Date startDate;
	private Date endDate;
	private Employee created;
	private boolean status;
	private Subject subject;
	
	public Notification(String id, String title, String type, String content, Date startDate, Date endDate,
			Employee created, boolean status, Subject subject) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.content = content;
		this.startDate = startDate;
		this.endDate = endDate;
		this.created = created;
		this.status = status;
		this.subject = subject;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getType() {	
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Employee getCreated() {
		return created;
	}
	
	public void setCreated(Employee created) {
		this.created = created;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Notification: [ID: " + id + "], title: " + title + "\ttype: " + type + "\nContent: " + content
				+ "\nStartDate: " + startDate + "\tendDate: " + endDate + "\nCreated: " + created + "\nStatus: "
				+ status + "\nSubject: " + subject;
	}
	
	public void addPersonObserver(Customer customer) {
		if (subject != null) {
			subject.addPersonObserver(customer);
		}
	}

	public void removePersonObserver(Customer customer) {
		if (subject != null) {
			subject.removePersonObserver(customer);
		}
	}


	public static void main(String[] args) {
		Date startDate1 = new Date();
		Date endDate1 = new Date(System.currentTimeMillis() + 604800000);
		Person p1 = new Person("01", "1251784", "Nguyen Van A", new Date(10, 05, 2002), "Male",
				new Address(53, "Đường số 6", "Khu phố 3", "Phường Linh Xuân", "Tp.Thủ Đức", "Tp.HCM"), "0161341662", 
				new Account("123@alo", "***"), new ArrayList<Order>());
		Employee creator1 = new Cashier(p1, "Thu ngan");
		
		Subject subject1 = new Admin();

		Notification notification1 = new Notification("1", "New Notification", "Info", "This is notification 1.",
				startDate1, endDate1, creator1, true, subject1);
		System.out.println(notification1);
	}

}
