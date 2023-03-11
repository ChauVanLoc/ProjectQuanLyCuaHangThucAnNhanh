package modul;

import java.util.Date;

public class CleaningStaff extends Employee {
	public CleaningStaff(String cccd, String name, Date dateOfBirth, String sex, Address address, String email, String phone,
			String academicLevel) {
		this.person = new Person(cccd, name, dateOfBirth, sex, address, phone);
		setAcademicLevel(academicLevel);
	}
}
