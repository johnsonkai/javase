package cn.ck.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class��ϰ��
 * Class���������ֽ����ļ����࣬�ۼ���ClassLoader��javac������ֽ����ļ����ص��ڴ�ʱ����Class����ַ������ļ���������
 * һ��Classʵ�о��Ƕ����һ���ӿ���Ϣ��������������������⣬����һ���������е����ӿ�
 *���¾���class �����ȡ�ķ�ʽ,class���õķ������ܣ�
 * @author Administrator
 *enum
 */
public class ClassDemo  {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//ͨ������������ֽ�����ص��ڴ�ķ�ʽ��ȡclass����
		Class cla=Class.forName("cn.ck.reflect.People");
		System.out.println(cla.toString());
		//ͨ�����class���Ի�ȡClass����
		Class cla1=People.class;
		
		//ͨ�������getClass����������ȡClass����
		Class cla2=new People().getClass();
		System.out.println(cla.getName());//��ȡ���ȫ��
		System.out.println(cla.getModifiers());//��ȡ������η�,1��ʾpublic
		System.out.println(cla.getPackage());//��ȡ�����ڰ�������
		Properties pro=new Properties();//����һ��properties����,������һ��hashtable��һ������
		InputStream inStream=cla.getClassLoader().getResourceAsStream("cn/ck/reflect/classInfo.properties");//��ȡָ��·������Դ
		pro.load(inStream);//��properties�����ļ�����Ϣ���ص�property������
		String className=pro.getProperty("className");
		System.out.println(className);
		System.out.println("-------------------------------");
		//ͨ��class�����жϸ�class����ʲô���͵�(��ע�⣬���ǽӿڣ��������飬��ö�����ͣ���java�������͵ȵ�)
		System.out.println(cla.isAnnotation());//�ж�calssʵ���Ƿ����һ��ע�⡣���飬�ӿھͲ�չʾ��
		System.out.println(cla.isPrimitive());//�ж�calssʵ���Ƿ���java��������
		System.out.println(cla.isLocalClass());//�ж��ǲ��ǵײ�ı�����
		
		
		
	}
}
