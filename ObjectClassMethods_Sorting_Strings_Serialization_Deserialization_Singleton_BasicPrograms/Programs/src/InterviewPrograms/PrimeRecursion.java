package InterviewPrograms;

import java.util.Scanner;

public class PrimeRecursion {

	static boolean isPrime(int num) {
		if(num==0 || num==1) {
			return true;
		}
		for(int i=0;i<num/2;i++) {
			if(num%2 == 0) {
				return true;
			}
		}
		return false;//doubt
	}
	
	
   public static void main(String[] args) {
		    int n;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number to check whether it is prime or not");
	        n=sc.nextInt();
	        
	        if(isPrime(n)) {
	        	System.out.println("Not a prime number");
	        }
	        else
	        	System.out.println("Prime Numbers");
	        }
   }
