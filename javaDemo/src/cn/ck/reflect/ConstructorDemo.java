package cn.ck.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 /* 获取构造器对象以及相应的方法运用,构造器主要用来new对象的。
 * @author Administrator
 *
 */

public class ConstructorDemo {
	public static void main(String[] args) throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Class cla=People.class;
		//获取任意公共的构造方法对象（包括父类），其他获取构造方法对象跟字段一样。
		People p=(People) cla.getConstructor(String.class,int.class).newInstance("mary",12);
		System.out.println(p.getAge());
		
	}
}
