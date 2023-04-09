package ThreadMovieEx;

public class BookTicket {

	static int totalSeats = 20;

	public static synchronized void  bookSeat(int bookSeat) {
		if (totalSeats >= bookSeat) {
			totalSeats = totalSeats - bookSeat;
			System.out.println("Seat Booked Successfully! "+bookSeat);
			System.out.println("Remaning Seat : " + totalSeats);
		}else
		{
			System.out.println("Seat Can not booked ");
			
			System.out.println("Seat Left "+totalSeats);
		}
	}

}
