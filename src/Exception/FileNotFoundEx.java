package Exception;


class AgeNotAllowed extends RuntimeException
{
	public AgeNotAllowed(String msg) {
		super(msg);
	}

}

public class FileNotFoundEx {

	public static void main(String[] args) {
        int age =17;
		if(age<17)
		{
			throw new AgeNotAllowed("Age not allowed");
			//throw new Exception();
		}
		
	}

}
