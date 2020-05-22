package cn.ck.thread;

public class TicketClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketRunnable salePoint = new TicketRunnable();
		//TicketRuunable salePoint2 = new TicketRuunable();
		Thread t1 = new Thread(salePoint, "第一售票点");
		Thread t2 = new Thread(salePoint,"第二个售票点");
		Thread t3 = new Thread(salePoint,"第三个售票点");
		Thread t4 = new Thread(salePoint,"第四售票点");
		t1.setPriority(Thread.MAX_PRIORITY);//优先级高的线程执行概率高。
		t4.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//t2.setPriority(Thread.MIN_PRIORITY);	//t3.setPriority(Thread.NORM_PRIORITY);
	}
}
