package models.person.employee;

import constant.Salary;
import models.EmployeeObserver;

public class SalaryStrategy1 implements ISalary {

	@Override
	public double salary(EmployeeObserver emp) {
		double totalSalary = 0;
		for (TimeSheet t : emp.getTimeWork().getTimeSheeats()) {
			if (t.getIsLate()) {
				totalSalary += emp.salaryByPosition() - Salary.fee_late;
			}
			totalSalary += emp.salaryByPosition();
		}
		return totalSalary;
	}

}
