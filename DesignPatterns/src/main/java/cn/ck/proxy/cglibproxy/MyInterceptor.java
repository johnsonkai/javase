package cn.ck.proxy.cglibproxy;

import java.lang.reflect.Method;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


public class MyInterceptor implements MethodInterceptor{
	Movable mover;
	
	public MyInterceptor(Movable mover) {
		this.mover = mover;
	}

	@Override
	public Object intercept(Object proxy, Method arg1, Object[] arg2,
			MethodProxy methodProxy) throws Throwable {
		System.out.println("plane begin");
		//Object obj=methodProxy.invoke(mover, arg2);
		Object obj=methodProxy.invokeSuper(proxy,arg2);
		System.out.println("plane end");
		return obj;
	}

}
