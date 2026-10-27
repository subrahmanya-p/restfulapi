package student;

import java.util.List;
import javax.ws.rs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import jakarta.websocket.server.PathParam;

@Path("/students")
public class GetStudens {

	StudentRepository stdRepository = new StudentRepository();

	@GET

	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })

	public List<Student> getStudents() {
		return stdRepository.getAllStudents();

	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(@PathParam("id") int id) {

		if (stdRepository.getStudent(id) != null) {
			return stdRepository.getStudent(id);
		}
		return null;
	}

	@POST
	@Path("/addstudent")
	public Student addStudnet(Student s1) {
		System.out.println(s1);
		stdRepository.create(s1);
		return s1;

	}

}
