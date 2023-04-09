package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFound {

	public static void main(String[] args) {

		try {
			FileInputStream file=new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
