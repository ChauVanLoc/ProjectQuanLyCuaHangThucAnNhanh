package models.person.employee;

import java.util.Date;

public class TimeSheet {
	private String title;
	private Date day;

	public TimeSheet(Date day) {
		this.day = day;
		this.title = "Working day " + this.day.toString();
	}

}
