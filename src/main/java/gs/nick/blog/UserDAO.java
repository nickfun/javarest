package gs.nick.blog;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

public interface UserDAO {
	@SqlUpdate("create table users ( id int primary key , username varchar(200) , password varchar(200) , email varchar(200) , role int")	
	void createUserTable();

	@SqlUpdate("insert into users ( username, password, email, role ) values (:name, :pass, :email, :role)")
	void insert(@Bind("name") String username, @Bind("pass") String password, @Bind("email") String email, @Bind("role") int role );

	@SqlQuery("select name from users where id = :id")
	String findNameById(@Bind("id") int id);
}