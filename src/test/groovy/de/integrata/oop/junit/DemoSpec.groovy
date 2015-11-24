package de.integrata.oop.junit


import de.integrata.oop.junit.data.EmployeeId;
import spock.lang.Specification
import spock.lang.Unroll;

class DemoSpec extends Specification {

	Database database = Mock(Database);
	EmployeeServiceImpl employeeService = new EmployeeServiceImpl(database);
	
	def setup() {
	}
	
	def "when findById throws null, an excpetion is thrown"() {
		given:
		database.findById(_) >> null
		def list = [1,2,3]
		
		when:
		employeeService.findById(new EmployeeId("something"))
		
		then:
		def e = thrown(Exception)
		e.message == "bla"
		list.find { it == 2 }
	}
	
	
	
	@Unroll
	def "Param test demo #a x #b = #c"() {
		expect:
		a * b == c
		
		where:
		a   |    b    || c
		5   |    5    || 25
		1   |    1    || 1

		
	}
	
	
	
	
	
	
	
	
	
	
}
