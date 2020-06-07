package InterviewPrograms;

import java.util.Scanner;

public class Factorial {

	static int factorial(int n) {
		
		if(n==0 || n==1)
			return 1;

		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        System.out.println("The factorial of given number is "+factorial(num));
        
	}
}
