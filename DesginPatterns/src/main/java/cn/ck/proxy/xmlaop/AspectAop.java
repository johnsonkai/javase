package cn.ck.proxy.xmlaop;
/**
 * 切面类，经常使用的非业务逻辑代码叫关注点代码，由关注组成的代码叫切面
 * @author Administrator
 *
 */
public class AspectAop {
	public void begin(){
		System.out.println("plane start");
	}
	public void end(){
		System.out.println("plane stop");
	}
}
