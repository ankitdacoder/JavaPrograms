package ThreadEx;

public class ThreadDemo {

	public static void main(String[] args) {

		System.out.println("Main ThreadName : " +Thread.currentThread().getName());
		
		Thread.currentThread().setName("Ankit Thread");
		
		//System.out.println(10/0);
		
		ThreadEx1 th1 = new ThreadEx1();
		th1.setPriority(2);
		th1.start();
		
		
		ThreadEx2 th2 = new ThreadEx2();
		th2.setPriority(2);
		th2.start();
		
		//System.out.println(th1.isAlive());
		//System.out.println(th2.isAlive());
	//	System.out.println(Thread.currentThread().isAlive());
		
	}

}
