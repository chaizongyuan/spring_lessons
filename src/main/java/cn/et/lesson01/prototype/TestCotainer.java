package cn.et.lesson01.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/**
 * FileSystemXmlApplicationContext 从文件系统寻找xml文件  带盘符
 * ClassPathXmlApplicationContext 从类路径下寻找 常用 建议使用
 * GenericXmlApplicationContext 通用 默认查找类路径 
 * WebApplicationContext web.xml中实例化
 * 
 *  就近原则  所有ApplicationContext指令 都支持 字符串定义查找方式
 *    classpath:
 *    file:
 * 
 * @author Administrator
 *
 */
public class TestCotainer {

	public static void main(String[] args) {
		//容器对象
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson01/prototype/spring.xml");
		A a=(A)context.getBean("a");
		A a1=(A)context.getBean("a");
		System.out.println(a==a1);
		
	}

}
