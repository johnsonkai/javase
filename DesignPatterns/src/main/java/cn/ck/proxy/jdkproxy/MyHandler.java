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

	/**
	 *
	 * @param proxy  第一个参数指的是jdk生成的代理对象
	 * @param method 第二个参数指的是目标对象的目标方法
	 * @param args  第三个参数指的是目标对象的目标方法的参数
	 * @return  方法返回值为调用目标方法的返回值
	 * @throws Throwable
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("plane begin");//新增的逻辑
		Object obj=method.invoke(mover, mover);//调用目标对象的目标方法
		System.out.println("plane end");//新增的逻辑
		return obj;
	}

}
