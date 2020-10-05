package InterviewPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n value");
		n=sc.nextInt();
        int first = 0;
        int second = 1;
        int third = 0;
        System.out.println(first);
        System.out.println(second);
        for(int i=2;i<n;i++) {
        	third = first+second ;   // 0 1 1 2 3 5 8 13 21 34 55 89 
        	first = second;
        	second = third;
        	System.out.println(third);
        }
	}

}
