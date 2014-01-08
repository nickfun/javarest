package gs.nick.blog;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yammer.metrics.annotation.Timed;

@Path("/names")
public class NameResource {
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	@Timed
	public List<String> index() {
		List<String> names = null;
		names = new ArrayList<String>();
		names.add("Nick");
		names.add("Mike");
		names.add("Jason");
		names.add("Aiza");
		return names;
	}
}