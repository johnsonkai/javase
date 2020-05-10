package cn.ck.proxy.staticproxy;


/**
 *静态代理测试类
 */
public class TestProxy {
	public static void main(String[] args) throws InterruptedException {
		Movable p=new Plane();
		//日志代理类
		PlaneLogProxy plp=new PlaneLogProxy(p);
		plp.move();
		//时间代理类型
		PlaneTimeProxy simplePtp =new PlaneTimeProxy(p);
		simplePtp.move();
		//时间代理类嵌套日志代理类
		PlaneTimeProxy ptp=new PlaneTimeProxy(plp);
		ptp.move();
	}
}
