package de.integrata.oop.junit;

import de.integrata.oop.junit.data.Employee;
import de.integrata.oop.junit.data.EmployeeId;

public class EmployeeServiceImpl implements EmployeeService {

	private final Database database;

	public EmployeeServiceImpl(Database database) {
		this.database = database;
	}

	public Employee enlist(Employee newEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee findById(EmployeeId id) {

		Object result = database.findById(Employee.class, id.toString());
	
		if (result == null) throw new IllegalArgumentException("Jibbet nit");
		
		return (Employee) result;
	}
	
	public void dismiss(Employee employee) {
		// TODO Auto-generated method stub

	}

}
