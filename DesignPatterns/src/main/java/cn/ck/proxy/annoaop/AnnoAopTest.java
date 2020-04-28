package cn.ck.proxy.annoaop;

import cn.ck.proxy.xmlaop.Movable;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoAopTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
       Movable plane= (Movable) applicationContext.getBean("plane");
       plane.move();
    }
}
