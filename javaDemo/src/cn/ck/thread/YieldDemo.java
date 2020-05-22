package cn.ck.thread;

import javafx.scene.layout.Priority;

/**
 * yield是暴露的意思，让掉当前线程cpu的时间片，使正在运行的线程重新处于就绪状态，并重新竞争cpu的调度权。
 * 改线程可能又获取到调度权，也有可能被其他线程获取。不能用synchronized锁着对象（当前线程持有锁对象，不会释放资源的），否则还是当前线程拿到cpu的调度权
 * synchronized 方法，块里面不能包含循环，否则只有一个线程执行循环的内容。循环的内容也不能有volatile类型的变量
 * yeild与sleep的区别和相同点
 * 相同点：当前线程如果持有锁，不会释放资源的，都能暂停当前线程
 * 不同点：1.sleep是通过让当前线程休眠一段时间（毫秒级别）yield是按时间片划分，让掉线程的时间片
 * 2.yield不能被中断，sleep能被打断
 * synchronized加锁有二种方式：
 * 一种是同步方法，普通同步方法获取的是类的实例的锁，静态同步方法获取的是类的锁（更消耗性能）
 * 二种是同步块：实例同步块，锁对象，锁类（class对象）
 * 
 * @author Administrator
 *
 */
public class YieldDemo {
	public static void main(String[] args) {
		Runnable runable=new MyRunnable();
		Thread t=new Thread(runable, "jack");
		Thread t1=new Thread(runable,"mary");
		Thread t2=new Thread(runable,"jerk");
		/*t1.setPriority(Thread.MIN_PRIORITY);
		t.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);*/
		t1.start();
		//t1.setPriority(7);
		t.start();
		
		t2.start();
	
		
			
		
	}

}
class MyRunnable implements Runnable{
	private  int num=0;
	@Override
	public void run() {
		try {
			showYield();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	public   void showYield() throws InterruptedException{
		while(num>=0){
			synchronized (this) {
				if (num>100){
					break;
				}
				Thread.sleep(10);//因为持有锁对象不会释放锁对象，所以在当前线程执行时，不会有其他线程执行。
				System.out.println(Thread.currentThread().getName()+"===="+num++);
		
			}
			//调用yield当前线程持有锁对象，不会释放资源，为了测试yield能够让其他线程获取到cpu调度权并执行。所以把他放在synchronized块外面。
			if(num%10==0){
				Thread.yield();
			}
			
		}
	}
	
}