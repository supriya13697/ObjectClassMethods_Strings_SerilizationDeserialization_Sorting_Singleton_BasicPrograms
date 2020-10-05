package Patterns;

import java.util.Scanner;

public class Demo {
     public static void main(String args[]) {
    	 
//    	 *****
//    	 ****
//    	 ***
//    	 **
//    	 *
    	 
    	 
    	 int n;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter n");
    	 n = sc.nextInt();
    	 
    	 for(int i = 0; i<n; i++){
    		 for(int j=0 ; j<n-i ; j++) {
    			 System.out.print("*");
    		 }
             System.out.println();
    	 }
     }
}
