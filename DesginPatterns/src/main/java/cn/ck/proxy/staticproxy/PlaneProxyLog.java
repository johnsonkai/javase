package cn.ck.proxy.staticproxy;





/**
 * �ɻ����й��̼�¼�ķɻ�������
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
