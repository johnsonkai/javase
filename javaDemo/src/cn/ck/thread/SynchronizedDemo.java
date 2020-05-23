package cn.ck.thread;
/**
 * synchronized�����ķ�ʽ��
 * ͬ��������1����ͨͬ���������������������������2����̬ͬ�����������������������
 * ͬ������飺1����������Ķ��������2�������������
 * @author Administrator
 * synchronizedԭ��ÿ��������һ�������������� Monitor����Monitor��һ���߳�ռ�ã�Monitor��������״̬
 * ���߳̽���monitorǰ��monitor������һ������������¼����monitor����������߳��������������Ϊ1�Ͳ��ø��߳̽���ö���monitor��������
 * ���̴߳�������״̬
 * ��������Ϊ0���߳̾���monitor����Ȩ���߳̾��ܽ���monitor����Ӧ�Ķ���
 * 
 */
public class SynchronizedDemo {
	//��ͨͬ������
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
	//��̬ͬ������
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
		//ͬ������飬����Ķ����������������this��
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
		//ͬ������飬����Ķ����������������this��
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
	//��ͨͬ��������������
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
	//��̬ͬ��������������,��̬ͬ�����������Ǽ���ͬ�������������ϣ���ͬ����ķ�����������ͬ����
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
		//ͬ�������Զ��������������
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
			//��̬ͬ��������������,��̬ͬ�����������Ǽ���ͬ�������������ϣ���ͬ����ķ�����������ͬ����
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
