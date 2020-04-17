package cn.ck.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Properties;
import java.util.Scanner;

/**
 * 通过配置文件获取任意类的对象，任意方法，并调用该方法,调用方法时通过在控制台提醒输入什么类型的参数，然后在控制台输入相应参数
 * @author Administrator
 *
 */
public class RelflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		//读取配置文件的全类名
		Properties properties = new Properties();
		InputStream stream=RelflectDemo.class.getClassLoader().getResourceAsStream("cn/ck/reflect/classInfo.properties");
		properties.load(stream);
		String className=properties.getProperty("className");
		System.out.println(className);
		String method=properties.getProperty("method");
		//获取class对象,并创建相应类的对象
		Class cla=Class.forName(className);
		Object o=cla.newInstance();
		//通过class对象获取该对象所有的方法对象，
		Method [] methodObjs=cla.getDeclaredMethods();
		for (int i = 0; i < methodObjs.length; i++) {
			String methodName=methodObjs[i].getName();
			int modifiers=methodObjs[i].getModifiers() ;
			//找到配置文件所对应的方法
			if(methodName.contains(method)){
				System.out.println("调用类:"+className+"方法："+methodName+"类修饰符为"+methodObjs[i].getModifiers());//方法名是不带路径的
				Class [] paraTypes=methodObjs[i].getParameterTypes();
				System.out.println("该方法一共有"+paraTypes.length+"个参数");
				Object []  paras=new Object [paraTypes.length];
				Scanner sc =new Scanner(System.in);
				//获取方法的每一个参数类型，并且在控制台输入相应的参数类型
				for(int j=0;j<paraTypes.length;j++){
					String paraTypeName=paraTypes[j].getName();
					System.out.println("请输入"+paraTypeName+"类型的参数");//参数类型指的是类的全路径
					String input=sc.next();
					if( paraTypes[j]==int.class){
						paras[j]=Integer.parseInt(input);
					} else if(paraTypes[j]==float.class){
						paras[j]=Float.parseFloat(input);
					} else if(paraTypes[j]==double.class){
						paras[j]=Double.parseDouble(input);
					}else if(paraTypes[j]==byte.class){
						paras[j]=Byte.parseByte(input);
					}else if(paraTypes[j]==short.class){
						paras[j]=Short.parseShort(input);
					}else if(paraTypes[j]==char.class){
						paras[j]=input.charAt(0);
					}else if(paraTypes[j]==Boolean.class){
						paras[j]=Boolean.parseBoolean(input);
					}else {
						paras[j]=input;
					}
				}
				//调用方法先判断是否是private休息的方法
				if(Modifier.isPrivate(modifiers)){
					methodObjs[i].setAccessible(true);
				}
				//判断一下调用的方法是否有返回参数
				if(methodObjs[i].getReturnType()==void.class){
					methodObjs[i].invoke(o, paras);
				}	else{
					System.out.println("运行结果为："+methodObjs[i].invoke(o, paras));
				}
				
			}
		}
		
	}
}
