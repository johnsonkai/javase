package cn.com.io;

public class TestTypeConvert {
	public static void main(String[] args) {
		//基本类型——>包装类型
		int a=9;
		Integer i= new Integer(a);
		Integer i1=Integer.valueOf(a);
		Integer i2= a;
		//包装类型->基本类型
		int a1 = i.intValue();
		int a2=i;
		//基本类型->String类型
		String s  =String.valueOf(a);
		String s1=a+"";
		//String类型->基本类型
		int a3=Integer.parseInt(s);
		//String类型->包装类型
		Integer i3=new Integer(s);
		Integer i4= Integer.valueOf(s);
		//包装类型->String类型
		String s2=i+"";
		String s3=i.toString();
		String s4=String.valueOf(i);
		
	}
}
