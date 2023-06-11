package models.person.employee;

import models.Observer;
import models.person.Person;

public abstract class Employee implements Observer {
	protected Person person;
	protected String academicLevel;

	public String getAcademicLevel() {
		return academicLevel;
	}

	public void setAcademicLevel(String academicLevel) {
		this.academicLevel = academicLevel;
	}

	public Person getPerson() {
		return person;
	}

}
