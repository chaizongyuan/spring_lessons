package cn.et.lesson03.aop.java;


import java.lang.reflect.Proxy;
import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		
		//被拦截的房东租房类
		HouseOwner ho = new FHouseOwner();
		//实现拦截类
		HouseProxy hp = new HouseProxy(ho);
		//中介代理对象
		HouseOwner hproxy = (HouseOwner)Proxy.newProxyInstance(Test.class.getClassLoader(),	
			ho.getClass().getInterfaces(),hp);
		hproxy.seekMyHouse();
	}
	
	
}
