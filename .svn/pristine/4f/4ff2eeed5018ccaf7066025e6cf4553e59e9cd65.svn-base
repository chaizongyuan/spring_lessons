package cn.et.lesson01.hello;

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
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson01/hello/spring.xml");
		A a=(A)context.getBean("a");
		A b=(A)context.getBean("b");
		System.out.println(a==b);
		
		//如果没有指定id的类 默认的名字 是 类名#编号
		String[] str=context.getBeanDefinitionNames();
		for(String tmp:str){
			System.out.println(tmp);
		}
		
	}

}
