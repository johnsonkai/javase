package cn.ck.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Method类就是对一个类,接口的方法进行描述的一个类，所以首先要获取描述一个类的class对象
 * method对象的获取的方式，以及method对象一些常用的方法。
 * @author Administrator
 *
 */
public class MethodDemo {
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class cla=People.class;
		People p=(People) cla.newInstance();
		//获取当前类（包括父类的方法）的指定公共方法对象
		Method method=cla.getMethod("showPeople",  String.class,int.class);//通过方法名称，以及入参类型获取method对象，
		//Method method1=cla.getMethod("demo");
		System.out.println(method.toString());
		//获取当前所有的公共方法包括父类方法
		method.invoke(p, "jack",23);
		Method [] methods=cla.getMethods();
		
		for (Method meth:methods) {
			
		}
		//获取当前类指定的方法对象，包括非公共方法
		Method demo=cla.getDeclaredMethod("demo");
		demo.invoke(p);
		demo.setAccessible(true);//开启暴力反射。,私有的成员方法必须开启暴力反射。
		System.out.println(demo);
		Method [] ownMethods=cla.getDeclaredMethods();
		for (Method ownMethod:ownMethods) {
			Class [] parameters=ownMethod.getParameterTypes();//方法形参类型
			String strParameter="";
			int i=1;
			
			for (;i<parameters.length+1;i++) {
				
				strParameter=strParameter+i+":"+parameters[i-1].getName()+"\n";
				
			}
			
			String returnName=ownMethod.getReturnType().getName();
			System.out.println("方法名为："+ownMethod.getName()+"\n"+"方法形参有类型有:"+strParameter+"返回值类型是"+returnName);
		}
		
		//System.out.println(method.invoke(obj, args));
		
	}
}
