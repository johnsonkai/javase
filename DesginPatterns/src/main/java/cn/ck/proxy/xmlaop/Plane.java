package cn.ck.proxy.xmlaop;

import java.util.Random;



/**
 * ��Ҫ����Ķ���ɻ��࣬ʵ��movable�ӿ�
 * @author Administrator
 *
 */
public class Plane implements Movable {
	
	public void move() throws InterruptedException {
		System.out.println("plane luanching...");
		Thread.sleep(new Random().nextInt((int) (1000)));
		
	}
	

}
