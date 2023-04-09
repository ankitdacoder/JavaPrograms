package ThreadEx;

public class ThreadClassDemo extends Thread  {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadClassDemo thr1=new ThreadClassDemo();
		thr1.setName("Thread-1");
		//thr1.setPriority(1);
		thr1.start();
		Thread.yield();
		ThreadClassDemo thr2=new ThreadClassDemo();
		thr2.setName("Thread-2");
		//thr1.setPriority(10);
		thr2.start();
	}
	
	
	public void run()
	{
		
		try {
			print();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Single Task with Multiple Thread : "+Thread.currentThread().getName());
	}
	
	
	public void print() throws InterruptedException
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i +Thread.currentThread().getName());
		    Thread.sleep(1000);
		}
	}

}
