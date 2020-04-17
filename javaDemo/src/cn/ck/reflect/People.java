package cn.ck.reflect;

public class People {
	private String name;
	private int age;
	public int tall;
	
	public int getTall() {
		return tall;
	}

	public void setTall(int tall) {
		this.tall = tall;
	}

	public People() {
		super();
		
	} 
	
	public People(String name,int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public People(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private static void showPeople(String name,int age){
		System.out.println("Ãû×Ö£º"+name+"ÄêÁä:"+age);
	}
	 void demo(){
		System.out.println("demo");
	}
	
}
