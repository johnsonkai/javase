package cn.ck.collection.list;

import java.util.ArrayList;
/**
 * 将一个student类型的数据加入Arraylist,并且要求student不重复，重复跟不重复根据Student的name跟age是否相同来判断。
 * @author Administrator
 *
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Student> stuList=new ArrayList<Student>();
		Student stu=new Student("jack", 23);
		Student stu1=new Student("mary", 36);
		Student stu2=new Student("jack", 23);
		stuList.add(stu);
		stuList.add(stu1);
		stuList.add(stu2);
		ArrayList<Student> stuList1=new ArrayList<Student>();
		System.out.println(stuList.toString());
		for (int i = 0; i < stuList.size(); i++) {
			Student s=stuList.get(i);
			if(!stuList1.contains(s)){
				stuList1.add(s);
			}
		}
		System.out.println(stuList1.toString());
		
	}
}
