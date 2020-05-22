package cn.ck.thread;
/**
 * volatile可以看成是synchronized的轻量级实现，拥有synchronzied的可见性的特点，但是没有synchronzied
 * 的原子性，volatile可见性指的是volatile修饰的成员变量不存在工作线程副本，每次线程直接从内存读取数据。volatile
 * 保证了变量对于不同线程是可见的。volatile还保证变量不会被重排序，保证了有序性。volatile比synchronzied更加简单
 * 开销小，但是volatile不能像synchronized对资源加锁。
 * volatile使用条件：对变量进行写操作不依赖变量的值（线程副本）
 * 变量不能包含其他变量的恒等式。volatile只能用来修饰单一变量,不能和其他不是volatile的变量进行运算
 * @author Administrator
 *volatile使用情况列子：线程状态改变的程序
 */
public class volatileDemo {
	//volatile保证了变量对线程的可见性
	private static  boolean stop=false;
	public static void stops(){
		stop=true;
	}
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		String currentThread=Thread.currentThread().getName();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
					//stop=true;
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stops();
				
			}
		}).start();
		while(!stop){
			//stop没有用volatile修饰会无限循环，但是如果用了println方法就不会无限循环，因为print方法是用synchronized修饰的,具有可见性。
			//System.out.println("主线程正在运行中");
			//System.out.println(currentThread+" 线程正在运行中");
		}
		long end=System.currentTimeMillis();
		System.out.println(currentThread+"线程结束"+"用时："+(end-start));
		
		
		
	}
}
