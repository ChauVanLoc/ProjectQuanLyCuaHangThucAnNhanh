package models;

import constant.Salary;
import models.person.Person;
import models.person.employee.Cashier;
import models.person.employee.ISalary;
import models.person.employee.KitchenStaff;
import models.person.employee.Shipper;
import models.person.employee.TimeWork;

public abstract class EmployeeObserver {
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
