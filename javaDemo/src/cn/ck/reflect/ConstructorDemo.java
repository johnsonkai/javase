package cn.ck.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 /* ��ȡ�����������Լ���Ӧ�ķ�������,��������Ҫ����new����ġ�
 * @author Administrator
 *
 */

public class ConstructorDemo {
	public static void main(String[] args) throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Class cla=People.class;
		//��ȡ���⹫���Ĺ��췽�����󣨰������ࣩ��������ȡ���췽��������ֶ�һ����
		People p=(People) cla.getConstructor(String.class,int.class).newInstance("mary",12);
		System.out.println(p.getAge());
		
	}
}
