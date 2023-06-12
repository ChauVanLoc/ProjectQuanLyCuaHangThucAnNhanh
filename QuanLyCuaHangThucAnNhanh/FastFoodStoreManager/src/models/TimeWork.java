package models;

import java.util.ArrayList;
import java.util.List;

import models.person.employee.TimeSheet;

public class TimeWork {
	private String title;
	private int month;
	private int year;
	private List<TimeSheet> timeSheeats;

	public TimeWork(int month, int year) {
		this.month = month;
		this.year = year;
		this.timeSheeats = new ArrayList<>();
	}
}
