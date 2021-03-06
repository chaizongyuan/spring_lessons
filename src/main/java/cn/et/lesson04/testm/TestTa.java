package cn.et.lesson04.testm;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.lesson04.testm.dao.AcDaoImpl;

/**
 * 编程式事务 
 * 声明式事务
 *    xml声明（全局）
 *    注解声明
 */

public class TestTa {
	static AcDaoImpl myMoneyDao;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson04/testm/spring.xml");
		myMoneyDao=(AcDaoImpl)context.getBean("acDaoImpl");
	}

	public static void main(String[] args) throws Exception {
		myMoneyDao.updateAminusTest();
	}
	
}
