package cn.ck.reflect;

import java.lang.reflect.Field;

/**
 * ͨ��class�����ȡһ�����͵ĳ�Ա�����Ķ���
 * ����Ա������װ��Filed��
 * @author Administrator
 *
 */
public class FiledDemo {
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchFieldException, InstantiationException, IllegalAccessException {
		Class cla=Class.forName("cn.ck.reflect.People");
		People p =(People) cla.newInstance();
		//��ȡ��Ա��������ȡ��Ա�������󣨹�����Ա����,��������ĳ�Ա������
		Field f=cla.getField("tall");
	    //����Ա��������ֵ
		f.set(p, 20);
		int tall= (Integer) f.get(p);
		System.out.println("���Ϊ��"+tall);
		//��ȡ���еĹ�����Ա���������������ĳ�Ա��������
		Field [] fields=cla.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println("��Ա"+(i+1)+":"+fields[i].getName());
		}
		//��ȡ��������еĳ�Ա�������󣬰���˽�еĳ�Ա��������
		Field [] ownFields=cla.getDeclaredFields();
		for (int i = 0; i < ownFields.length; i++) {
			System.out.println("��Ա"+(i+1)+":"+ownFields[i].getName());
		}
		//ͨ����Ա�������ƻ�ȡ����ĳ�Ա�������󣨰�����public��Ա����������������ĳ�Ա������
		Field ownField=cla.getDeclaredField("age");
		ownField.setAccessible(true);
		f.set(p, 20);
		int age=f.getInt(p);
		System.out.println("���Ϊ"+age);
	}
}
