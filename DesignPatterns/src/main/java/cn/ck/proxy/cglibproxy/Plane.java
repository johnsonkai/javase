package cn.ck.proxy.cglibproxy;

import java.util.Random;



/**
 * ��Ҫ����Ķ���ɻ��࣬ʵ��movable�ӿ�
 * ģ��ɻ���
 * @author Administrator
 *
 */
public class Plane implements Movable{

	public void move() throws InterruptedException {
		System.out.println("plane luanching...");
		Thread.sleep(new Random().nextInt((int) (1000)));

		
	}

}
