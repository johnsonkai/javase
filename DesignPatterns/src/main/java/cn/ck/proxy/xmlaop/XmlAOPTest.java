package cn.ck.proxy.xmlaop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAOPTest {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext  applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Movable p=(Movable) applicationContext.getBean("plane");//如果实现某个接口，需要用接口类型指定spirng的bean
		p.move();
		
	}
}
