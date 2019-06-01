package javaspringexamples.springJDBC.runningSqlQueries;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public User findById(long userId) {
		return jdbcTemplate.queryForObject("SELECT id, name, user_name, access_time, locked FROM USER WHERE id = ?",
				new RowMapper<User>() {
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User user = new User();
						user.setId(rs.getLong("id"));
						user.setName(rs.getString("name"));
						user.setUserName(rs.getString("user_name"));
						user.setAccessTime(rs.getTimestamp("access_time"));
						user.setLocked(rs.getBoolean("locked"));
						return user;
					}

				}, userId);
	}
}