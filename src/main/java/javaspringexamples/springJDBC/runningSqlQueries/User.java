package javaspringexamples.springJDBC.runningSqlQueries;

import java.util.Date;

import lombok.Data;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
@Data
public class User {
	private long id;
	private String name;
	private String userName;
	private Date accessTime;
	private boolean locked;
}
