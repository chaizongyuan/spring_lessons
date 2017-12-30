package cn.et.lesson02.cycle;


public class A {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void ini(){
		System.out.println("init");
	}
	
	public void des(){
		System.out.println("destroy");
	}
}
