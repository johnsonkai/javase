package cn.ck.proxy.staticproxy;





/**
 * 飞机飞行过程记录的飞机代理类
 * @author Administrator
 *
 */
public class PlaneProxyLog implements Movable {
	Movable mover;
	public PlaneProxyLog(Movable mover){
		this.mover=mover;
	}
	public void move() throws InterruptedException {
		System.out.println("plane begin");
		mover.move();
		System.out.println("plane end");
		
	}

}
