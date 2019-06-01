package javaspringexamples.springJDBC.runningSqlQueries;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class Main {
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Conf.class);
		
		UserDao userDao = applicationContext.getBean(UserDao.class);
		
		User user = userDao.findById(999L);
		
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getAccessTime());
		System.out.println(user.isLocked());
	}
}