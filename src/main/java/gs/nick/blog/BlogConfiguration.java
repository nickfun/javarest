package gs.nick.blog;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.*;
import com.yammer.dropwizard.db.DatabaseConfiguration;

public class BlogConfiguration extends Configuration {
	@Valid
	@NotNull
	@JsonProperty
	private DatabaseConfiguration database = new DatabaseConfiguration();
	
	public DatabaseConfiguration getDatabaseConfiguration() {
		return database;
	}
}
