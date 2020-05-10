package cn.ck.proxy.staticproxy;


/**
 * �ɻ����й��̼�¼�����ࣨ��־��
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
