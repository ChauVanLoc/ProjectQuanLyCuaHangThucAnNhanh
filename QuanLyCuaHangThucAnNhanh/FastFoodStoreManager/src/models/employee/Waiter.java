package models.employee;

import java.util.Date;

import constant.Password;
import constant.Rule;
import models.Account;
import models.Address;
import models.Person;
import models.Subject;

public class Waiter extends Employee {
	public Waiter(String cccd, String name, Date dateOfBirth, Date expiredDate, String sex, Address address,
			String email, String phone, String academicLevel, Subject subject) {
		super.person = new Person(cccd, name, dateOfBirth, sex, address, phone);
		setAcademicLevel(academicLevel);
		super.person.setSubject(subject);
		super.person.getSubject().addObserver(this);
		super.person.setAccount(new Account(email, Password.DEFAULT, Rule.CASHIER, expiredDate));
		super.person.getSubject().addAccount(super.person.getAccount());
	}
}
