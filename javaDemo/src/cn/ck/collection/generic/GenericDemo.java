package cn.ck.collection.generic;

import java.util.ArrayList;

import cn.ck.collection.list.Student;
/**
 * ���ͣ� ���ǽ����͵������������淶���͵Ķ���һ����һ����д��������ĸ��
 * @author Administrator
 *
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList aList=new ArrayList();
		ArrayList bList=new ArrayList<String>();
		ArrayList<String> cList=new ArrayList();
		aList.add(new Student("erk",1));//add(Object o)�������ԭ��û��ʹ�÷��͵ķ���
		System.out.println(aList.toString());
		bList.add(new Student("erk",1));//add(Object o)�������ԭ��û��ʹ�÷��͵ķ���
		System.out.println(bList.toString());
		cList.add("Str");//ֻ����ָ���ķ���String��ֻ��addһ��String���͵����ݡ�
		System.out.println(cList.toString());
		
	}
}
