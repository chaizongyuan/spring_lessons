package cn.et.lesson01.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * FileSystemXmlApplicationContext ���ļ�ϵͳѰ��xml�ļ�  ���̷�
 * ClassPathXmlApplicationContext ����·����Ѱ�� ���� ����ʹ��
 * GenericXmlApplicationContext ͨ�� Ĭ�ϲ�����·�� 
 * WebApplicationContext web.xml��ʵ����
 * 
 *  �ͽ�ԭ��  ����ApplicationContextָ�� ��֧�� �ַ���������ҷ�ʽ
 *    classpath:
 *    file:
 * 
 * @author Administrator
 *
 */
public class TestCotainer {

	public static void main(String[] args) {
		//��������
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson01/autowire/spring.xml");
		B b=(B)context.getBean("b");
		System.out.println(b.getA().size());
		
		
	}

}
