package cn.ck.proxy.xmlaop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAOPTest {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext  applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Movable p=(Movable) applicationContext.getBean("plane");//���ʵ��ĳ���ӿڣ���Ҫ�ýӿ�����ָ��spirng��bean
		p.move();
		
	}
}
