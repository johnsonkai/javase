package cn.com.io;

public class TestTypeConvert {
	public static void main(String[] args) {
		//�������͡���>��װ����
		int a=9;
		Integer i= new Integer(a);
		Integer i1=Integer.valueOf(a);
		Integer i2= a;
		//��װ����->��������
		int a1 = i.intValue();
		int a2=i;
		//��������->String����
		String s  =String.valueOf(a);
		String s1=a+"";
		//String����->��������
		int a3=Integer.parseInt(s);
		//String����->��װ����
		Integer i3=new Integer(s);
		Integer i4= Integer.valueOf(s);
		//��װ����->String����
		String s2=i+"";
		String s3=i.toString();
		String s4=String.valueOf(i);
		
	}
}
