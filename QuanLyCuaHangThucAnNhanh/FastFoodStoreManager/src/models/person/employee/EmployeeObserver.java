package models.person.employee;

import models.person.Person;

public abstract class EmployeeObserver {
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
