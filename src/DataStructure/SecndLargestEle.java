package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecndLargestEle {

	public static void main(String[] args) {

		int[] array = { 12, 34, 563, 1333, 32, 12 };

		int firstHigh, sendHigh;

		if (array[0] > array[1]) {
			firstHigh = array[0];
			sendHigh = array[1];
		} else {
			firstHigh = array[1];
			sendHigh = array[0];

		}

		for (int i = 2; i < array.length; i++) {

			if (array[i] > firstHigh) {
				sendHigh = firstHigh;
				firstHigh = array[i];
			}else
				if(array[i]<firstHigh && array[i]>sendHigh)
				{
					sendHigh=array[i];
				}

		}
		
		System.out.println("Second High : "+sendHigh);

	}

}
