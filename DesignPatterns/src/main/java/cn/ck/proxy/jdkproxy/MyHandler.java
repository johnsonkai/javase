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
	 * @param proxy  ��һ������ָ����jdk���ɵĴ������
	 * @param method �ڶ�������ָ����Ŀ������Ŀ�귽��
	 * @param args  ����������ָ����Ŀ������Ŀ�귽���Ĳ���
	 * @return  ��������ֵΪ����Ŀ�귽���ķ���ֵ
	 * @throws Throwable
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("plane begin");//�������߼�
		Object obj=method.invoke(mover, mover);//����Ŀ������Ŀ�귽��
		System.out.println("plane end");//�������߼�
		return obj;
	}

}
