package cn.ck.collection.generic;

import cn.ck.collection.list.Student;

/**
 * 泛型一般用E,T等大写字母表示，当方法中使用了没有确定类型的变量，改变量可以使用泛型
 * 方法泛型 定义格式： [static]<泛型的声明> 返回值类型 方法名(泛型  变量名)
 * @author Administrator
 *
 */
public class MethodGeneric {
	public static void main(String[] args) {
		String t="tt";
		Student s=new Student("jerk",45);
		System.out.println(getT(t).toString());
		System.out.println(getT(s).toString());
	
	}
	//定义一方法，入参是什么类型返回值就是什么类型
	public static <T> T getT(T t){
		return t;
	}

}
