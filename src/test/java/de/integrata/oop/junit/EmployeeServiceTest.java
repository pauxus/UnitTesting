package de.integrata.oop.junit;

import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.io.IOException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.mockito.Mock;

import de.integrata.oop.junit.data.EmployeeId;

public class EmployeeServiceTest {

	private EmployeeServiceImpl employeeService;
	
	@Mock private Database database;
	
	@Rule 
	public ExpectedException expected = ExpectedException.none();
	
	@Rule
	public TemporaryFolder temp = new TemporaryFolder();

	@Before
	public void setUp() {
		initMocks(this);
		employeeService = new EmployeeServiceImpl(database);
	}
	
	@Test
	public void test() {
		givenDatabaseReturnsNullOnFindById();
		findByIdShouldThrowException();
	}
	
	@Test
	public void testDatabaseFindIdReturnsNullThrowsException() throws IOException {
		givenDatabaseReturnsNullOnFindById();
		findByIdShouldThrowException();

		expected.expect(Exception.class);
		employeeService.findById(new EmployeeId("something"));
	}
	
	

	private void findByIdShouldThrowException() {
		try {
			employeeService.findById(new EmployeeId("something"));
			fail("Exception expected");
		} catch (Exception e) {	/* expected */	}
	}

	private void givenDatabaseReturnsNullOnFindById() {
		when(database.findById(any(Class.class), any(String.class))).thenReturn(null);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
