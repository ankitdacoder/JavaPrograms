package ThreadMovieEx;

public class MovieApp extends Thread {

	static BookTicket bookTicket;
    int bookSeat;
	public void run() {
		//System.out.println("Thread Name "+Thread.currentThread().getName());
		bookTicket.bookSeat(bookSeat);
	}

	public static void main(String[] args) {
		bookTicket = new BookTicket();

		MovieApp person1=new MovieApp();
		person1.bookSeat=6;
		person1.start();
		
		
		MovieApp person2=new MovieApp();
		person2.bookSeat=7;
		person2.start();
		
		MovieApp person3=new MovieApp();
		person3.bookSeat=8;
		person3.start();
		
		
		TotalEarning tE1=new TotalEarning();
		tE1.start();
		
		synchronized (tE1) {

			try {
				tE1.wait();
				System.out.println("Total Earning :" + tE1.total);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
	}

}
