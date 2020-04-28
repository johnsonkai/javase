package cn.ck.proxy.staticproxy;





/**
 * 飞机类的时间代理对象，用来计算飞机飞行的时间,即是飞机对象move方法调用的时间。
 * @author Administrator
 *
 */
public class PlaneTimeProxy implements Movable{
	Movable mover;
	public PlaneTimeProxy(Movable mover){
		this.mover=mover;
	}
	public void move() throws InterruptedException {
		// TODO Auto-generated method stub
		long begin=System.currentTimeMillis();
		mover.move();
		long end =System.currentTimeMillis();
		System.out.println("plane time:"+(end-begin));
		
	}

}
