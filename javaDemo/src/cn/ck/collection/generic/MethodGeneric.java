package cn.ck.collection.generic;

import cn.ck.collection.list.Student;

/**
 * ����һ����E,T�ȴ�д��ĸ��ʾ����������ʹ����û��ȷ�����͵ı������ı�������ʹ�÷���
 * �������� �����ʽ�� [static]<���͵�����> ����ֵ���� ������(����  ������)
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
	//����һ�����������ʲô���ͷ���ֵ����ʲô����
	public static <T> T getT(T t){
		return t;
	}

}
