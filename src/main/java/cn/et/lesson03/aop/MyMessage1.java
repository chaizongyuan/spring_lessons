package cn.et.lesson03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyMessage1 {
	public void beforeSeek(){
		System.out.println("«∞÷√");
	}
	public void afterSeek(){
		System.out.println("∫Û÷√");
	}
	public void throwException(JoinPoint jp){
		System.out.println("“Ï≥£");
		System.out.println(jp.getSignature().getName());
		
	}
	
}
