package models.person.employee;

import java.util.ArrayList;
import java.util.Date;

import models.Subject;
import models.person.Person;

public class Shipper extends Employee {
	public Shipper(String cccd, String name, Date dateOfBirth, Date expiredDate, String sex, String address,
			String email, String phone, String academicLevel, Subject subject, ISalary iSalary) {
		super.person = new Person(cccd, name, dateOfBirth, sex, address, email, phone, expiredDate);
		super.subject = subject;
		super.subject.addEmployee(this);
		super.iSalary = iSalary;
		super.notifications = new ArrayList<>();
	}
}
