package emp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class GetEmployees {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployees() {
		Employee e1 = new Employee();
		e1.setId(0);
		e1.setName("subrahmanyaa");
		e1.setSalary(2300.90);
		return e1;
	}
}
