package cn.ck.thread;
/**
 * volatile 多读写少的情况
 * @author Administrator
 * 为了保持count的对其他线程可见性 count用volatile修饰。为了保证对其他的线程的原子性，count修改值用synchronzied进行修饰
 * volatile的变量，不能包含在其他的不变式中,将一个volatile的变量赋给其他非volatile变量，非volatile修饰的变量还是不可见的。
 *
 */
public class volatileDemo1 {
	volatile static int   count=1;
	static int i=1;
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
					
						for(;i<50;i++){
							add();
							//System.out.println(Thread.currentThread().getName()+"线程当前计数器count为："+count++);
						}
						
					}
						
					
				
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		while(i<100){
			
			//System.out.println(Thread.currentThread().getName()+"线程当前计数器count为："+count);
		}
		System.out.println(count);
		System.out.println("线程结束");
	}
	public  static synchronized void add(){
		i=count;
	}
	

}
