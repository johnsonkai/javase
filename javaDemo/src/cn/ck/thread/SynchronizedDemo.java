package cn.ck.thread;
/**
 * synchronized加锁的方式：
 * 同步方法：1：普通同步方法（方法所属对象加锁），2：静态同步方法（方法所属类加锁）
 * 同步代码块：1：对任意类的对象加锁，2：对任意类加锁
 * @author Administrator
 * synchronized原理：每个对象都有一个监听器锁对象 Monitor，当Monitor被一个线程占用，Monitor处于锁定状态
 * 当线程进入monitor前，monitor对象有一个计数器，记录进入monitor所属对象的线程数，如果计数器为1就不让改线程进入该对象，monitor被锁定，
 * 改线程处于阻塞状态
 * 当计数器为0，线程就有monitor所有权，线程就能进入monitor所对应的对象。
 * 
 */
public class SynchronizedDemo {
	//普通同步方法
	public synchronized void demo0(){
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName+" start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(threadName+" end");
	}
	//静态同步方法
	public static synchronized void demo1(){
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName+" start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(threadName+" end");
	}
	
	
	public  void demo2(){
		//同步代码块，对类的对象加锁（本例中是this）
		synchronized(this){
			String threadName=Thread.currentThread().getName();
			System.out.println(threadName+" start");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(threadName+" end");
		}
		
	}
	public  void demo3(){
		//同步代码块，对类的对象加锁（本例中是this）
		synchronized(this.getClass()){
			String threadName=Thread.currentThread().getName();
			System.out.println(threadName+" start");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(threadName+" end");
		}
		
	}
	public static void main(String[] args) {
		//test0();
		//test1();
		//test2();
		test3();

		
		
	}
	//普通同步方法测试内容
	public static void test0(){
		final SynchronizedDemo sDemo=new SynchronizedDemo();
		Runnable runs=new Runnable() {
			@Override
			public void run() {
				sDemo.demo0();
			}
		};
		Thread t=new Thread(runs);
		Thread t1=new Thread(runs);
		t.start();
		t1.start();
	}
	//静态同步方法测试内容,静态同步方法加锁是加在同步方法所属类上，不同对象的方法照样可以同步。
		public static void test1(){
			final SynchronizedDemo sDemo=new SynchronizedDemo();
			final SynchronizedDemo sDemo1=new SynchronizedDemo();
	
			Thread t=new Thread(new Runnable() {
				@Override
				public void run() {
					
					sDemo.demo1();
				}
			});
			Thread t1=new Thread(new Runnable() {
				@Override
				public void run() {
					sDemo1.demo1();
				}
			});
			t.start();
			t1.start();
		}
		//同步代码块对对象加锁测试内容
		public static void test2(){
			final SynchronizedDemo sDemo=new SynchronizedDemo();
			Runnable runs=new Runnable() {
				@Override
				public void run() {
					sDemo.demo2();
				}
			};
			Thread t=new Thread(runs);
			Thread t1=new Thread(runs);
			t.start();
			t1.start();
		}
			//静态同步方法测试内容,静态同步方法加锁是加在同步方法所属类上，不同对象的方法照样可以同步。
			public static void test3(){
				final SynchronizedDemo sDemo=new SynchronizedDemo();
				final SynchronizedDemo sDemo1=new SynchronizedDemo();
		
				Thread t=new Thread(new Runnable() {
					@Override
					public void run() {
						
						sDemo.demo3();
					}
				});
				Thread t1=new Thread(new Runnable() {
					@Override
					public void run() {
						sDemo1.demo3();
					}
				});
				t.start();
				t1.start();
			}
	
}
