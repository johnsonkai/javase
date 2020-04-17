package cn.ck.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class练习类
 * Class类是描述字节码文件的类，累加器ClassLoader将javac编译的字节码文件加载到内存时，用Class类对字符节码文件进行描述
 * 一个Class实列就是对类或一个接口信息进行描述，可以这样理解，就是一个正在运行的类或接口
 *以下就是class 对象获取的方式,class常用的方法介绍：
 * @author Administrator
 *enum
 */
public class ClassDemo  {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//通过类加载器将字节码加载到内存的方式获取class对象
		Class cla=Class.forName("cn.ck.reflect.People");
		System.out.println(cla.toString());
		//通过类的class属性获取Class对象
		Class cla1=People.class;
		
		//通过对象的getClass（）方法获取Class对象
		Class cla2=new People().getClass();
		System.out.println(cla.getName());//获取类的全名
		System.out.println(cla.getModifiers());//获取类的修饰符,1表示public
		System.out.println(cla.getPackage());//获取类所在包的名称
		Properties pro=new Properties();//创建一个properties对象,本质是一个hashtable的一个子类
		InputStream inStream=cla.getClassLoader().getResourceAsStream("cn/ck/reflect/classInfo.properties");//获取指定路径的资源
		pro.load(inStream);//将properties配置文件的信息加载到property对象中
		String className=pro.getProperty("className");
		System.out.println(className);
		System.out.println("-------------------------------");
		//通过class对象判断该class代表什么类型的(是注解，还是接口，还是数组，是枚举类型，是java基本类型等等)
		System.out.println(cla.isAnnotation());//判断calss实例是否代表一个注解。数组，接口就不展示了
		System.out.println(cla.isPrimitive());//判断calss实例是否是java基本类型
		System.out.println(cla.isLocalClass());//判断是不是底层的本地类
		
		
		
	}
}
