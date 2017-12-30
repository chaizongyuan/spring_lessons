package cn.et.lesson04.jdbc.dao.imp;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.lesson04.jdbc.dao.MyMoneyDao;
/**
 * save*
 * update*
 * delete*
 * @author Administrator
 *
 */
@Repository
public class MyMoneyDaoImpl implements MyMoneyDao  {
	@Autowired
	JdbcTemplate jdbc;
	/* (non-Javadoc)
	 * @see cn.et.lesson04.jdbc.dao.imp.MyMoneyDao#aminus(int)
	 */
	public  void updateAminus(int money) throws SQLException{
		String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where userName='A'";
		jdbc.execute(sql);
	}
	/* (non-Javadoc)
	 * @see cn.et.lesson04.jdbc.dao.imp.MyMoneyDao#badd(int)
	 */
	public  void updateBadd(int money) throws SQLException{
		String sql="update mymoney set lostedmoney=lostedmoney+"+money+" where userName='B'";
		jdbc.execute(sql);
	}
}
