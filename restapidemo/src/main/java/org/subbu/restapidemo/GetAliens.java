package org.subbu.restapidemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/aliens")
public class GetAliens {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Aliens getAliens() {
		Aliens a1 = new Aliens();
		a1.setId(12);
		a1.setName("Subrahnyaa");
		return a1;
	}

}
