package models.person.employee;

import models.EmployeeObserver;

public interface ISalary {
	double salary(EmployeeObserver emp);
}
