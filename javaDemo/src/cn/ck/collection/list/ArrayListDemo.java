package cn.ck.collection.list;

import java.util.ArrayList;
/**
 * ��һ��student���͵����ݼ���Arraylist,����Ҫ��student���ظ����ظ������ظ�����Student��name��age�Ƿ���ͬ���жϡ�
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
