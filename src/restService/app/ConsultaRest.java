package restService.app;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import restService.so.ConsultaRestSo;

@Path("/Consulta")
@ApplicationPath("/resources")
public class ConsultaRest extends Application {

	// http://localhost:8080/restService/resources/Consulta/hello
	@GET
	@Path("/hello")
	public String getHello() {
		return "Hello World";
	}
	//http://localhost:8080/restService/resources/Consulta/dataXml
	@GET
	@Path("/dataXml")
	public ConsultaRestSo getObjectXml() {
		return new ConsultaRestSo(1,"Rodrigo");
	}
	
	//http://localhost:8080/restService/resources/Consulta/dataJson
	@GET
	@Path("/dataJson")
	@Produces(MediaType.APPLICATION_JSON)
	public ConsultaRestSo getObjectJson() {
		return new ConsultaRestSo(1,"Rodrigo");
	}

}
