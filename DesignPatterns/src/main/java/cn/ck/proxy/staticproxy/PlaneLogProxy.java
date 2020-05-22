package cn.ck.proxy.staticproxy;


/**
 * 飞机飞行过程记录代理类（日志）
 * @author Administrator
 *
 */
public class PlaneLogProxy implements Movable {
	Movable mover;
	public PlaneLogProxy(Movable mover){
		this.mover=mover;
	}
	public void move() throws InterruptedException {
		System.out.println("plane begin");
		mover.move();
		System.out.println("plane end");
		
	}

}
