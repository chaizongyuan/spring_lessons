package cn.et.lesson02.anno;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestCotainer {
	static ConfigurableApplicationContext context;
	static{
	    context = new GenericXmlApplicationContext("classpath:/cn/et/lesson02/anno/spring.xml");
	 
	}
	public static void main(String[] args) {
		A a=(A)context.getBean("a");
		System.out.println(a);
		context.close();
	}
}
