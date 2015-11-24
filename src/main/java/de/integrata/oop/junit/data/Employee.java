package de.integrata.oop.junit.data;

import java.util.Date;

public class Employee {

	private EmployeeId id;

	private String firstname;
	
	private String lastname;
	
	private final Date birthday;
	
	public Employee(EmployeeId id, String firstname, String lastname,
			Date birthday) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
	}
	
	public Employee(String firstname, String lastname, Date birthday) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
	}

	public void setId(EmployeeId id) {
		if (this.id != null) throw new IllegalStateException("id already set");
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public EmployeeId getId() {
		return id;
	}

	public Date getBirthday() {
		return birthday;
	}
	
	
}
