package cn.ck.proxy.cglibproxy;

import java.util.Random;



/**
 * 需要代理的对象飞机类，实现movable接口
 * 模拟飞机类
 * @author Administrator
 *
 */
public class Plane implements Movable{

	public void move() throws InterruptedException {
		System.out.println("plane luanching...");
		Thread.sleep(new Random().nextInt((int) (1000)));

		
	}

}
