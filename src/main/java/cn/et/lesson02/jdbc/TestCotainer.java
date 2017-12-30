package cn.et.lesson02.jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestCotainer {
	static JdbcTemplate jt;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson02/jdbc/spring.xml");
	    jt=(JdbcTemplate)context.getBean("jdbcTemplate");
	}
	public static void main(String[] args) throws SQLException{
		//ÈÝÆ÷¶ÔÏó
		query("select * from goods");
	}
	public static void query(String sql){
		List<Map<String, Object>> list=jt.queryForList(sql);
		System.out.println(list);
	}
	public static void update() {
		String sql="delete from goods where id=1";
		jt.execute(sql);
	}
}
