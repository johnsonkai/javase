package cn.ck.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Properties;
import java.util.Scanner;

/**
 * ͨ�������ļ���ȡ������Ķ������ⷽ���������ø÷���,���÷���ʱͨ���ڿ���̨��������ʲô���͵Ĳ�����Ȼ���ڿ���̨������Ӧ����
 * @author Administrator
 *
 */
public class RelflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		//��ȡ�����ļ���ȫ����
		Properties properties = new Properties();
		InputStream stream=RelflectDemo.class.getClassLoader().getResourceAsStream("cn/ck/reflect/classInfo.properties");
		properties.load(stream);
		String className=properties.getProperty("className");
		System.out.println(className);
		String method=properties.getProperty("method");
		//��ȡclass����,��������Ӧ��Ķ���
		Class cla=Class.forName(className);
		Object o=cla.newInstance();
		//ͨ��class�����ȡ�ö������еķ�������
		Method [] methodObjs=cla.getDeclaredMethods();
		for (int i = 0; i < methodObjs.length; i++) {
			String methodName=methodObjs[i].getName();
			int modifiers=methodObjs[i].getModifiers() ;
			//�ҵ������ļ�����Ӧ�ķ���
			if(methodName.contains(method)){
				System.out.println("������:"+className+"������"+methodName+"�����η�Ϊ"+methodObjs[i].getModifiers());//�������ǲ���·����
				Class [] paraTypes=methodObjs[i].getParameterTypes();
				System.out.println("�÷���һ����"+paraTypes.length+"������");
				Object []  paras=new Object [paraTypes.length];
				Scanner sc =new Scanner(System.in);
				//��ȡ������ÿһ���������ͣ������ڿ���̨������Ӧ�Ĳ�������
				for(int j=0;j<paraTypes.length;j++){
					String paraTypeName=paraTypes[j].getName();
					System.out.println("������"+paraTypeName+"���͵Ĳ���");//��������ָ�������ȫ·��
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
				//���÷������ж��Ƿ���private��Ϣ�ķ���
				if(Modifier.isPrivate(modifiers)){
					methodObjs[i].setAccessible(true);
				}
				//�ж�һ�µ��õķ����Ƿ��з��ز���
				if(methodObjs[i].getReturnType()==void.class){
					methodObjs[i].invoke(o, paras);
				}	else{
					System.out.println("���н��Ϊ��"+methodObjs[i].invoke(o, paras));
				}
				
			}
		}
		
	}
}
