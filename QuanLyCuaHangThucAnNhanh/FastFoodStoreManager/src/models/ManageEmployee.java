package models;

import java.util.ArrayList;
import java.util.List;

public class ManageEmployee {
	private List<EmployeeObserver> cuss;

	public ManageEmployee() {
		this.cuss = new ArrayList<>();
	}

	public List<EmployeeObserver> getEmployee() {
		return cuss;
	}

	public void addEmployee(EmployeeObserver o) {
		this.cuss.add(o);
	}

	public void deleteEmployee(EmployeeObserver o) {
		this.cuss.remove(o);
	}

	public void updateEmployee() {

	}
}
