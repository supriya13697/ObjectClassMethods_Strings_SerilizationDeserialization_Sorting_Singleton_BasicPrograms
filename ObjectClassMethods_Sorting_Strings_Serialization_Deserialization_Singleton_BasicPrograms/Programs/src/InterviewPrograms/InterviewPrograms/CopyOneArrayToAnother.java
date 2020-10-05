package InterviewPrograms;

import java.util.Arrays;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3, 5, 2, 6};
		int b[] = new int[a.length];
		
		//one way
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		
		//Another way
		b = Arrays.copyOf(a, a.length);
		
		
		for(int i : b) {
			System.out.println(i);
		}

	}

}
