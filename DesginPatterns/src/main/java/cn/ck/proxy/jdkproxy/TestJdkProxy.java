package cn.ck.proxy.jdkproxy;



import java.lang.reflect.Proxy;

import cn.ck.proxy.cglibproxy.Plane;



/**
 * jdk��̬�����÷��似������jdk��̬���ڴ����ɴ������
 * @author Administrator
 *
 */
public class TestJdkProxy {
	public static void main(String[] args) throws InterruptedException {
		Movable p= (Movable) new Plane();
		MyHandler h=new MyHandler(p);
		Movable mover=(Movable) Proxy.newProxyInstance(Plane.class.getClassLoader(), new Class[]{Movable.class}, h);
		mover.move();
	}

}
