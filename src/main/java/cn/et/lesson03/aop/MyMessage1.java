package cn.et.lesson03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyMessage1 {
	public void beforeSeek(){
		System.out.println("ǰ��");
	}
	public void afterSeek(){
		System.out.println("����");
	}
	public void throwException(JoinPoint jp){
		System.out.println("�쳣");
		System.out.println(jp.getSignature().getName());
		
	}
	
}
