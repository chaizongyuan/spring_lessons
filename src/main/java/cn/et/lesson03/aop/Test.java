package cn.et.lesson03.aop;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/**
 * springʵ��aop �������ּ���
 * 	1.java��̬����(����ӿڱ��)
 * 	2.cglibʵ�ֶ�̬����
 * @author Administrator
 *
 */
public class Test {
	static ConfigurableApplicationContext context;
	static{
		context = new GenericXmlApplicationContext("classpath:/cn/et/lession3/aop/spring.xml"); 
	}
	public static void main(String[] args) throws SQLException {
		FHouseOwner fo = (FHouseOwner)context.getBean("FHouseOwner");
		fo.addHouse();
		context.close();
		
	}
	
	
}