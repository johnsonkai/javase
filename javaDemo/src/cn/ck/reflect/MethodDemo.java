package cn.ck.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Method����Ƕ�һ����,�ӿڵķ�������������һ���࣬��������Ҫ��ȡ����һ�����class����
 * method����Ļ�ȡ�ķ�ʽ���Լ�method����һЩ���õķ�����
 * @author Administrator
 *
 */
public class MethodDemo {
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class cla=People.class;
		People p=(People) cla.newInstance();
		//��ȡ��ǰ�ࣨ��������ķ�������ָ��������������
		Method method=cla.getMethod("showPeople",  String.class,int.class);//ͨ���������ƣ��Լ�������ͻ�ȡmethod����
		//Method method1=cla.getMethod("demo");
		System.out.println(method.toString());
		//��ȡ��ǰ���еĹ��������������෽��
		method.invoke(p, "jack",23);
		Method [] methods=cla.getMethods();
		
		for (Method meth:methods) {
			
		}
		//��ȡ��ǰ��ָ���ķ������󣬰����ǹ�������
		Method demo=cla.getDeclaredMethod("demo");
		demo.invoke(p);
		demo.setAccessible(true);//�����������䡣,˽�еĳ�Ա�������뿪���������䡣
		System.out.println(demo);
		Method [] ownMethods=cla.getDeclaredMethods();
		for (Method ownMethod:ownMethods) {
			Class [] parameters=ownMethod.getParameterTypes();//�����β�����
			String strParameter="";
			int i=1;
			
			for (;i<parameters.length+1;i++) {
				
				strParameter=strParameter+i+":"+parameters[i-1].getName()+"\n";
				
			}
			
			String returnName=ownMethod.getReturnType().getName();
			System.out.println("������Ϊ��"+ownMethod.getName()+"\n"+"�����β���������:"+strParameter+"����ֵ������"+returnName);
		}
		
		//System.out.println(method.invoke(obj, args));
		
	}
}
