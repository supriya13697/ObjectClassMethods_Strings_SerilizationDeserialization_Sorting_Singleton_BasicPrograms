package InterviewPrograms;

import java.util.Arrays;
import java.util.Collections;

public class PrintElementsInReverseOrder {
	public static void main(String args[]) {
		int a[] = {1,2,3,5,3,6,8,5,3,7,7,7};
		
		for(int i = 0 ; i < a.length ; i = i+2) {
			if(i%2 == 0) {
			System.out.println(a[i]);
			}
		}
		
		
	}
}
