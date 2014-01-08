package gs.nick.blog;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class BlogService extends Service<BlogConfiguration> {
	
	public static void main( String[] args ) throws Exception {
		new BlogService().run(new String[] {"server"} );
		System.out.println("BlogService is running");
	}
	
	@Override
	public void initialize( Bootstrap<BlogConfiguration> bootstrap) {
		bootstrap.setName("nicks blog engine");
	}
	
	@Override
	public void run( BlogConfiguration configuration, Environment environment ) throws Exception {
		environment.addResource(new IndexResource() );
		environment.addResource(new NameResource() );
		environment.addResource(new HelloWorldResource("Hello %s!", "World"));
	}

}
