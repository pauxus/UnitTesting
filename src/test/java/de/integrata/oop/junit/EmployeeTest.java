package de.integrata.oop.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import de.integrata.oop.junit.data.Employee;
import de.integrata.oop.junit.data.EmployeeId;

public class EmployeeTest {

	private Employee employee;

	@Test
	public void testIdAlreadySetShouldThrowException() {
		givenAnEmployeeWithoutAnId();
		
		setIdToSomething();
		
		shouldHaveAnId();
		setId_ShouldThrowAnException();
	}

	private void setId_ShouldThrowAnException() {
		try {
			employee.setId(new EmployeeId("shouldFail"));
			fail("Expected Illegal State Exception");
		} catch (IllegalStateException e) {
			// expected
		}
	}

	private void shouldHaveAnId() {
		assertThat(employee.getId(), is(notNullValue()));
	}

	private void setIdToSomething() {
		employee.setId(new EmployeeId("shouldWork"));
	}

	private void givenAnEmployeeWithoutAnId() {
		employee = new Employee("Hans", "Müller", new Date(70, 05, 22));
	}
}
