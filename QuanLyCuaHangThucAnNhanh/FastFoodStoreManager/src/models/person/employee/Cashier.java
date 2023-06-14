package models.person.employee;

import java.util.Date;

import constant.Password;
import constant.Rule;
import models.EmployeeObserver;
import models.Subject;
import models.person.Address;
import models.person.Person;

public class Cashier extends EmployeeObserver {
	public Cashier(String cccd, String name, Date dateOfBirth, Date expiredDate, String sex, Address address,
			String email, String phone, String academicLevel, int rule, Subject subject, ISalary iSalary) {
		super.person = new Person(cccd, name, dateOfBirth, sex, address, email, phone, rule, expiredDate, subject,
				this);
		setAcademicLevel(academicLevel);
		super.iSalary = iSalary;
	}
}
