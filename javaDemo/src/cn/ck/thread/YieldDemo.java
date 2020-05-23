package cn.ck.thread;

import javafx.scene.layout.Priority;

/**
 * yield�Ǳ�¶����˼���õ���ǰ�߳�cpu��ʱ��Ƭ��ʹ�������е��߳����´��ھ���״̬�������¾���cpu�ĵ���Ȩ��
 * ���߳̿����ֻ�ȡ������Ȩ��Ҳ�п��ܱ������̻߳�ȡ��������synchronized���Ŷ��󣨵�ǰ�̳߳��������󣬲����ͷ���Դ�ģ��������ǵ�ǰ�߳��õ�cpu�ĵ���Ȩ
 * synchronized �����������治�ܰ���ѭ��������ֻ��һ���߳�ִ��ѭ�������ݡ�ѭ��������Ҳ������volatile���͵ı���
 * yeild��sleep���������ͬ��
 * ��ͬ�㣺��ǰ�߳�����������������ͷ���Դ�ģ�������ͣ��ǰ�߳�
 * ��ͬ�㣺1.sleep��ͨ���õ�ǰ�߳�����һ��ʱ�䣨���뼶��yield�ǰ�ʱ��Ƭ���֣��õ��̵߳�ʱ��Ƭ
 * 2.yield���ܱ��жϣ�sleep�ܱ����
 * synchronized�����ж��ַ�ʽ��
 * һ����ͬ����������ͨͬ��������ȡ�������ʵ����������̬ͬ��������ȡ��������������������ܣ�
 * ������ͬ���飺ʵ��ͬ���飬���������ࣨclass����
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
				Thread.sleep(10);//��Ϊ���������󲻻��ͷ������������ڵ�ǰ�߳�ִ��ʱ�������������߳�ִ�С�
				System.out.println(Thread.currentThread().getName()+"===="+num++);
		
			}
			//����yield��ǰ�̳߳��������󣬲����ͷ���Դ��Ϊ�˲���yield�ܹ��������̻߳�ȡ��cpu����Ȩ��ִ�С����԰�������synchronized�����档
			if(num%10==0){
				Thread.yield();
			}
			
		}
	}
	
}