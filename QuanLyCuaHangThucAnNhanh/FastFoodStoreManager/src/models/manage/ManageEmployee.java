package models.manage;

import java.util.ArrayList;
import java.util.List;

import models.person.employee.Employee;

public class ManageEmployee {
	private List<Employee> cuss;

	public ManageEmployee() {
		this.cuss = new ArrayList<>();
	}

	public List<Employee> getEmployee() {
		return cuss;
	}

	public void addEmployee(Employee o) {
		this.cuss.add(o);
	}

	public void deleteEmployee(Employee o) {
		this.cuss.remove(o);
	}

	public void updateEmployee() {

	}

//	public EmployeeObserver createEmployee(int rule, )
}
