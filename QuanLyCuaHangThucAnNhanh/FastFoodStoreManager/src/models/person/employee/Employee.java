package models.person.employee;

import constant.Salary;
import models.PersonObserver;
import models.person.Person;

public abstract class Employee extends PersonObserver {
	protected Person person;
	protected String academicLevel;
	protected TimeWork timeWork;
	protected ISalary iSalary;

	public String getAcademicLevel() {
		return academicLevel;
	}

	public void setAcademicLevel(String academicLevel) {
		this.academicLevel = academicLevel;
	}

	public TimeWork getTimeWork() {
		return timeWork;
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
}
