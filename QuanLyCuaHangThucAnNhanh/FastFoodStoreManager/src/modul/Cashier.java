package modul;

import java.util.Date;

public class Cashier extends Employee {
	public Cashier(String cccd, String name, Date dateOfBirth, String sex, Address address, String email, String phone,
			String academicLevel) {
		this.person = new Person(cccd, name, dateOfBirth, sex, address, phone);
		setAcademicLevel(academicLevel);
	}
}
