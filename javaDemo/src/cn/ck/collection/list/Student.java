package cn.ck.collection.list;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;		
		}
		if(this.getClass()==obj.getClass()){
			Student s=(Student)obj;
			if(s.getAge()==this.getAge()&&s.getName()!=null&&s.getName()!=""&&s.getName().equals(this.getName())){
				return true;
			} else{
				return false;
			}
		} 
		return false;
	}
	
	
	
}
