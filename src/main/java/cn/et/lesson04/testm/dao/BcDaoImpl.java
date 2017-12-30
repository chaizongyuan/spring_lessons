package cn.et.lesson04.testm.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class BcDaoImpl {
	@Autowired
	JdbcTemplate jdbc;
	public  void saveBadd(int money) throws SQLException{
		String sql="update mymoney set lostedmoney=lostedmoney+"+money+" where id=4";
		jdbc.execute(sql);
	}
}
