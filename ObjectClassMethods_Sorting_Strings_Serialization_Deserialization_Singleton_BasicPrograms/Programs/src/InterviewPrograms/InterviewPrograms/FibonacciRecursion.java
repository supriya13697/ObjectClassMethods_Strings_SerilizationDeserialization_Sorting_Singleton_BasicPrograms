package InterviewPrograms;

import java.util.Scanner;

public class FibonacciRecursion {

	 static int fibonacci(int n) {
		if(n==0)
			return 0;
		if (n==1)
			return 1;
		return fibonacci(n-2)+fibonacci(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits");
		num = sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println(fibonacci(i));
		}
	}

}
