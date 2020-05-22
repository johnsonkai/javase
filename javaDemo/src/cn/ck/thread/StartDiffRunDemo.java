package cn.ck.thread;
/**
 * start方法里面调用了run方法，run方法是实现Runnable接口的类都有，而start方法是Thread的方法，
 * start方法仅仅是开启线程，让线程处于就绪状态，让线程处于能被cpu调度的状态，能与其他线程竞争资源的状态。
 * run方法是线程进行运行的方法，
 * @author Administrator
 *
 */
public class StartDiffRunDemo {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Thread thread= new Thread( new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}) ;
		//开启start方法
		thread.start();
		System.out.println("调用start方法所用时间"+String.valueOf(System.currentTimeMillis()-start));
		//开启run方法
		thread.run();
		System.out.println("调用run方法所用时间"+String.valueOf(System.currentTimeMillis()-start));
		
	}
	

}
