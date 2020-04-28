package cn.ck.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * 
 * @author Administrator
 *
 */
public class MyHandler implements InvocationHandler{
	Movable mover;
	
	public MyHandler(Movable mover) {
		super();
		this.mover = mover;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("plane begin");
		Object obj=method.invoke(mover, args);
		System.out.println("plane end");
		return obj;
	}

}
