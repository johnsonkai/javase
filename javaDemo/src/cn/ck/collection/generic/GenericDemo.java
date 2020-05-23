package cn.ck.collection.generic;

import java.util.ArrayList;

import cn.ck.collection.list.Student;
/**
 * 泛型： 就是将类型当作变量处理。规范泛型的定义一般是一个大写的任意字母。
 * @author Administrator
 *
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList aList=new ArrayList();
		ArrayList bList=new ArrayList<String>();
		ArrayList<String> cList=new ArrayList();
		aList.add(new Student("erk",1));//add(Object o)这个还是原来没有使用泛型的方法
		System.out.println(aList.toString());
		bList.add(new Student("erk",1));//add(Object o)这个还是原来没有使用泛型的方法
		System.out.println(bList.toString());
		cList.add("Str");//只能用指定的泛型String了只能add一个String类型的数据。
		System.out.println(cList.toString());
		
	}
}
