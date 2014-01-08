package gs.nick.blog;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yammer.metrics.annotation.Timed;

@Path("/")
public class IndexResource {
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	@Timed
	public List<Blog> index() {
		List<Blog> blogList = new ArrayList<Blog>();
		blogList.add( new Blog("Title 1", "http://nick.gs/") );
		blogList.add( new Blog("Old homepage on the web", "http://www.yahoo.com"));
		return blogList;
	}
}