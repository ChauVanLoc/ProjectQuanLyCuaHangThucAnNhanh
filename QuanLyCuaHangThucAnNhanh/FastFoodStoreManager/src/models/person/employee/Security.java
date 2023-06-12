package models.person.employee;

import java.util.Date;

import constant.Password;
import constant.Rule;
import models.person.Person;

public class Security extends EmployeeObserver {
	public Security(String cccd, String name, Date dateOfBirth, Date expiredDate, String sex, Address address, String email, String phone,
			String academicLevel, Subject subject) {
		super.person = new Person(cccd, name, dateOfBirth, sex, address, phone);
		setAcademicLevel(academicLevel);
		super.person.setSubject(subject);
		super.person.getSubject().addObserver(this);
		super.person.setAccount(new Account(email, Password.DEFAULT, Rule.SECURITY, expiredDate));
		super.person.getSubject().addAccount(super.person.getAccount());
	}
}
