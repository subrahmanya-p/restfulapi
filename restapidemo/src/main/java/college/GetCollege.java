package college;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/colleges")
public class GetCollege {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<College> getCollege() {
		System.out.println("request come");
		College clg = new College();
		clg.setName("vc");
		clg.setPlace("puttur");
		clg.setGrade('A');
		clg.setFees(35000.0);
		College clg2 = new College();
		clg2.setName("vc");
		clg2.setPlace("puttur");s
		clg2.setGrade('A');
		clg2.setFees(35000.0);
		List<College> collegeList = Arrays.asList(clg, clg2);
		return collegeList;
	}
}
