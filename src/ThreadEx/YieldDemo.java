package ThreadEx;

public class YieldDemo extends Thread {

	static Thread mainThread;
	
	
	public void run()
	{

	

		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread" + " " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	
	public static void main(String[] args) {
		
		mainThread=Thread.currentThread();
		YieldDemo th1=new YieldDemo();
		th1.start();
        th1.interrupt();
		System.out.println(th1.isInterrupted());
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Main Thread "+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
