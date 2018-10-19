package io.veicot.openshift.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.Date;


@Path("/test")
public class Test extends Application {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok(dateFormat.format(date)).build();
		
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//Date date = new Date();
		//System.out.println(dateFormat.format(date));
	}
}
