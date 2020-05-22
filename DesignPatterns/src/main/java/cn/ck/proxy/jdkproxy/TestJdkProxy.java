package cn.ck.proxy.jdkproxy;



import java.lang.reflect.Proxy;

import cn.ck.proxy.cglibproxy.Plane;



/**
 * jdk动态代理：用反射技术，由jdk动态在内存生成代理对象。
 * @author Administrator
 *
 */
public class TestJdkProxy {
	public static void main(String[] args) throws InterruptedException {
		Movable p= (Movable) new Plane();
		MyHandler h=new MyHandler(p);
		/**
		 *通过Proxy类的newProxyInstance方法创建代理对象，newProxyInstance方法：第一个参数表示目标类的类加载器，
		 * 第二个参数指定目标类实现的接口的字节码数组对象，
		 * 第三个参数指的是实现目标方法扩展的InvocationHandler实现类。
		 */
		Movable mover=(Movable) Proxy.newProxyInstance(Plane.class.getClassLoader(), new Class[]{Movable.class}, h);
		mover.move();
	}

}
