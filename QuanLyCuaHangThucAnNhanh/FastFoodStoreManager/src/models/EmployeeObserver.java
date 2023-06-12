package models;

import models.person.Person;

public abstract class EmployeeObserver {
	protected Person person;
	protected String academicLevel;
	protected TimeWork timeWork;

	public String getAcademicLevel() {
		return academicLevel;
	}

	public void setAcademicLevel(String academicLevel) {
		this.academicLevel = academicLevel;
	}
	
//	public void check

}
