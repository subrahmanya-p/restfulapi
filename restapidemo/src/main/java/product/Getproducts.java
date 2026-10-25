package product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/products")
public class Getproducts {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Product getStudents() {
		Product pdt = new Product();
		pdt.setId(12);
		pdt.setName("laptop");
		pdt.setPrice(35000.89);
		pdt.setAval(true);
		return pdt;

	}

}
