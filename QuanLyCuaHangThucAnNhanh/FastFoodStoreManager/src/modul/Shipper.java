package modul;

import java.util.Date;

public class Shipper extends Employee {
	public Shipper(String cccd, String name, Date dateOfBirth, String sex, Address address, String email, String phone,
			String academicLevel, Subject subject) {
		this.person = new Person(cccd, name, dateOfBirth, sex, address, phone, subject);
		setAcademicLevel(academicLevel);
		subject.addObserver(this);
	}
}
