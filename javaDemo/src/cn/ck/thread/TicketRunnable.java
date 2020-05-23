package cn.ck.thread;

public class TicketRunnable implements Runnable {
	private int ticketNum = 100;

	// boolean flag = true;

	public void run() {
		
		
			saleMethod1();
			//saleMethod3();
			//saleMethod2();
	}

	public synchronized void saleMethod1() {
		while (true) {

			if (ticketNum <= 0) {

				break;
			}
			try {
			Thread.sleep(10);
			System.out.println(Thread.currentThread().getName() + "���˵�"+ ticketNum-- + "��Ʊ");
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		}	
			
		

	}

	public void saleMethod2() {
		
		synchronized(this){
			while (true) {
				if (ticketNum <= 0) {
					break;
				}
		
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "���˵�"
					+ ticketNum-- + "��Ʊ" + Thread.currentThread().getPriority());
			}
		}
		
	}

	public  void saleMethod3() {
		while (true) {

			if (ticketNum <= 0) {

				break;
			}
		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "���˵�"
				+ ticketNum-- + "��Ʊ" + Thread.currentThread().getPriority());
		}
	}


}
