package cn.ck.thread;
/**
 * volatile���Կ�����synchronized��������ʵ�֣�ӵ��synchronzied�Ŀɼ��Ե��ص㣬����û��synchronzied
 * ��ԭ���ԣ�volatile�ɼ���ָ����volatile���εĳ�Ա���������ڹ����̸߳�����ÿ���߳�ֱ�Ӵ��ڴ��ȡ���ݡ�volatile
 * ��֤�˱������ڲ�ͬ�߳��ǿɼ��ġ�volatile����֤�������ᱻ�����򣬱�֤�������ԡ�volatile��synchronzied���Ӽ�
 * ����С������volatile������synchronized����Դ������
 * volatileʹ���������Ա�������д����������������ֵ���̸߳�����
 * �������ܰ������������ĺ��ʽ��volatileֻ���������ε�һ����,���ܺ���������volatile�ı�����������
 * @author Administrator
 *volatileʹ��������ӣ��߳�״̬�ı�ĳ���
 */
public class volatileDemo {
	//volatile��֤�˱������̵߳Ŀɼ���
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
			//stopû����volatile���λ�����ѭ���������������println�����Ͳ�������ѭ������Ϊprint��������synchronized���ε�,���пɼ��ԡ�
			//System.out.println("���߳�����������");
			//System.out.println(currentThread+" �߳�����������");
		}
		long end=System.currentTimeMillis();
		System.out.println(currentThread+"�߳̽���"+"��ʱ��"+(end-start));
		
		
		
	}
}
