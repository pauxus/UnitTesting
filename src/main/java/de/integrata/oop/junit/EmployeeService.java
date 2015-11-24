package de.integrata.oop.junit;

import de.integrata.oop.junit.data.Employee;
import de.integrata.oop.junit.data.EmployeeId;

public interface EmployeeService {

	public Employee enlist(Employee newEmployee);
	
	public Employee findById(EmployeeId id);
	
	public void dismiss(Employee employee);
	
}
