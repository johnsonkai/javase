package cn.ck.proxy.staticproxy;





/**
 * �ɻ����ʱ����������������ɻ����е�ʱ��,���Ƿɻ�����move�������õ�ʱ�䡣
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
