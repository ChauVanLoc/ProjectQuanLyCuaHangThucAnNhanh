package models.person.employee;

import java.util.List;

import constant.Salary;
import models.PersonObserver;
import models.person.Person;

public abstract class Employee extends PersonObserver {
	protected List<TimeWork> timeWork;
	protected ISalary iSalary;

	public void setTimeWork(List<TimeWork> timeWork) {
		this.timeWork = timeWork;
	}

	public List<TimeWork> getTimeWork() {
		return timeWork;
	}

	public TimeWork getLatestTimeWork() {
		return this.timeWork.get(this.timeWork.size() - 1);
	}

	public double salary() {
		return this.iSalary.salary(this);
	};

	public double salaryByPosition() {
		if (this instanceof Cashier) {
			return Salary.salary_of_cashier;
		} else if (this instanceof KitchenStaff) {
			return Salary.salary_of_kitchen_staff;
		} else if (this instanceof Shipper) {
			return Salary.salary_of_shipeer;
		}
		return 0;
	}

	public void attendance() {

	}
	
	public void disableAccount(boolean status) {
		super.person.getAccount().setStatus(status);
	}
}
