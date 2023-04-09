package ThreadEx;

public class RunnableDemo implements Runnable {

	public static void main(String[] args) {
		RunnableDemo r = new RunnableDemo();
		Thread th = new Thread(r);
		th.start();
		
		Thread th1 = new Thread(r);
		th1.start();
	}

	@Override
	public void run() {

		System.out.println("Runnning : " + Thread.currentThread().getName());
	}

}
