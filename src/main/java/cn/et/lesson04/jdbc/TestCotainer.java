package cn.et.lesson04.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 编程式事务 
 * 声明式事务
 *    xml声明（全局）
 *    注解声明
 */

public class TestCotainer {
	static DataSource dataSource;
	static Connection conn;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson04/jdbc/spring.xml");
		dataSource=(DataSource)context.getBean("dataSource");
	}

	public static void main(String[] args) throws SQLException {
		try {
			//前置通知
			conn=dataSource.getConnection();
			conn.setAutoCommit(false);
			//业务逻辑
			//jdbc默认是自动提交
			aminus(10);
			int i=5/0;
			badd(10);
			//后置通知
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			conn.rollback();
		}finally {
			conn.close();
		}
		
		
	}
	public static void aminus(int money) throws SQLException{
		String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where userName='A'";
		conn.prepareStatement(sql).executeUpdate();
	}
	public static void badd(int money) throws SQLException{
		String sql="update mymoney set lostedmoney=lostedmoney+"+money+" where userName='B'";
		conn.prepareStatement(sql).executeUpdate();
	}
}
