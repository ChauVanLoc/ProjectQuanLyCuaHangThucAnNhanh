package models.manage;

import java.util.ArrayList;
import java.util.List;

import models.PersonObserver;
import models.person.employee.Employee;

public class EmployeeManage {
	private List<PersonObserver> employees;
	private List<PersonObserver> admins;

	public EmployeeManage() {
		this.employees = new ArrayList<>();
		this.admins = new ArrayList<>();
	}

	public List<PersonObserver> getEmployee() {
		return employees;
	}
	
	public List<PersonObserver> getAdmin() {
		return admins;
	}

	public void addEmployee(PersonObserver o) {
		this.employees.add(o);
	}

	public void deleteEmployee(PersonObserver o) {
		this.employees.remove(o);
	}

	public void updateEmployee() {

	}

	public void addAdmin(PersonObserver o) {
		this.admins.add(o);
	}

}
