package cn.ck.thread;

public class TicketClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketRunnable salePoint = new TicketRunnable();
		//TicketRuunable salePoint2 = new TicketRuunable();
		Thread t1 = new Thread(salePoint, "��һ��Ʊ��");
		Thread t2 = new Thread(salePoint,"�ڶ�����Ʊ��");
		Thread t3 = new Thread(salePoint,"��������Ʊ��");
		Thread t4 = new Thread(salePoint,"������Ʊ��");
		t1.setPriority(Thread.MAX_PRIORITY);//���ȼ��ߵ��߳�ִ�и��ʸߡ�
		t4.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//t2.setPriority(Thread.MIN_PRIORITY);	//t3.setPriority(Thread.NORM_PRIORITY);
	}
}
