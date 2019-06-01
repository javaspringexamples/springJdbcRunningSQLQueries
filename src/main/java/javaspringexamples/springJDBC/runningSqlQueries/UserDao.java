package javaspringexamples.springJDBC.runningSqlQueries;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public interface UserDao {
	public User findById(long usertId);
}