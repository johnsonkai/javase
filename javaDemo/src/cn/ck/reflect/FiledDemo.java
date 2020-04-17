package cn.ck.reflect;

import java.lang.reflect.Field;

/**
 * 通过class对象获取一个类型的成员变量的对象
 * 将成员变量封装成Filed类
 * @author Administrator
 *
 */
public class FiledDemo {
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchFieldException, InstantiationException, IllegalAccessException {
		Class cla=Class.forName("cn.ck.reflect.People");
		People p =(People) cla.newInstance();
		//获取成员变量名获取成员变量对象（公共成员变量,包括父类的成员变量）
		Field f=cla.getField("tall");
	    //给成员变量设置值
		f.set(p, 20);
		int tall= (Integer) f.get(p);
		System.out.println("身高为："+tall);
		//获取所有的公共成员变量对象包括父类的成员变量对象
		Field [] fields=cla.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println("成员"+(i+1)+":"+fields[i].getName());
		}
		//获取本类的所有的成员变量对象，包括私有的成员变量对象
		Field [] ownFields=cla.getDeclaredFields();
		for (int i = 0; i < ownFields.length; i++) {
			System.out.println("成员"+(i+1)+":"+ownFields[i].getName());
		}
		//通过成员变量名称获取本类的成员变量对象（包括非public成员变量，不包括父类的成员变量）
		Field ownField=cla.getDeclaredField("age");
		ownField.setAccessible(true);
		f.set(p, 20);
		int age=f.getInt(p);
		System.out.println("年纪为"+age);
	}
}
