package cn.et.lesson04.testm.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class AcDaoImpl {
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	BcDaoImpl b;
	public  void updateAminus(int money) throws Exception{
		//��Ǯ
		String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where id=3";
		jdbc.execute(sql);
		
		//��Ǯ
		b.saveBadd(money);
		throw new FileNotFoundException();
		//int i=5/0;
	}
	public  void updateAminusTest() throws Exception{
		//��Ǯ
		String sql="update mymoney set lostedmoney=80 where username='A'";
		jdbc.execute(sql);

	}
}
