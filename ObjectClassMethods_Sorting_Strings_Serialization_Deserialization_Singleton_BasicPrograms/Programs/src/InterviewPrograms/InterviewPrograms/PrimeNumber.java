package InterviewPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is prime or not");
        n=sc.nextInt();
        
        int flag = 0;
        
        if(n==0 || n==1) {
        	System.out.println("Not a prime number");
        }
        
        else {
        	for(int i=2; i<= n/2; i++) {
        		if(n%i == 0) {
        			System.out.println("Not a Prime Number");
        			flag = 1;
        			break;
        		}
        	}
        	if(flag==0) {
        		System.out.println("Prime number");
        	}
        		
        }
	}

}
