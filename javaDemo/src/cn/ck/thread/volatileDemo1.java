package cn.ck.thread;
/**
 * volatile ���д�ٵ����
 * @author Administrator
 * Ϊ�˱���count�Ķ������߳̿ɼ��� count��volatile���Ρ�Ϊ�˱�֤���������̵߳�ԭ���ԣ�count�޸�ֵ��synchronzied��������
 * volatile�ı��������ܰ����������Ĳ���ʽ��,��һ��volatile�ı�������������volatile��������volatile���εı������ǲ��ɼ��ġ�
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
							//System.out.println(Thread.currentThread().getName()+"�̵߳�ǰ������countΪ��"+count++);
						}
						
					}
						
					
				
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		while(i<100){
			
			//System.out.println(Thread.currentThread().getName()+"�̵߳�ǰ������countΪ��"+count);
		}
		System.out.println(count);
		System.out.println("�߳̽���");
	}
	public  static synchronized void add(){
		i=count;
	}
	

}
