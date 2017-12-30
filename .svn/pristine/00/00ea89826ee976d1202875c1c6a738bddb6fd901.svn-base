package cn.et.lesson03.aop.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现代理类
 * @author Administrator
 *
 */
public class HouseProxy implements InvocationHandler {
	/**
	 * 代理类
	 */
	HouseOwner house;
	public HouseProxy(HouseOwner house) {
		this.house=house;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("找租客");
		System.out.println("租金");
		//前置通知
		
		//目标对象 房东
		Object obj=null;
		try {
			 obj= method.invoke(house,args);
			 //环绕通知
		} catch (Exception e) {
			//异常通知
			e.printStackTrace();
		}
		//后置通知
		System.out.println("租客搬家");
		return obj;
	}

}
