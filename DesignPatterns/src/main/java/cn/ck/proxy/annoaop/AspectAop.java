package cn.ck.proxy.annoaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * �����࣬����ʹ�õķ�ҵ���߼�����й�ע����룬�ɹ�ע��ɵĴ��������
 * @author Administrator
 *
 */
@Aspect
public class AspectAop {
	@Pointcut("execution(* cn.ck.proxy.xmlaop.Plane.move())")
	public void points(){

	}
	@Before("points()")
	public void begin(){
		System.out.println("plane start");
	}
	@After("points()")
	public void end(){
		System.out.println("plane stop");
	}
}
