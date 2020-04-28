package cn.ck.proxy.annoaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 切面类，经常使用的非业务逻辑代码叫关注点代码，由关注组成的代码叫切面
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
