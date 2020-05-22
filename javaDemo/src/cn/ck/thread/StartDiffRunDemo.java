package cn.ck.thread;
/**
 * start�������������run������run������ʵ��Runnable�ӿڵ��඼�У���start������Thread�ķ�����
 * start���������ǿ����̣߳����̴߳��ھ���״̬�����̴߳����ܱ�cpu���ȵ�״̬�����������߳̾�����Դ��״̬��
 * run�������߳̽������еķ�����
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
		//����start����
		thread.start();
		System.out.println("����start��������ʱ��"+String.valueOf(System.currentTimeMillis()-start));
		//����run����
		thread.run();
		System.out.println("����run��������ʱ��"+String.valueOf(System.currentTimeMillis()-start));
		
	}
	

}
