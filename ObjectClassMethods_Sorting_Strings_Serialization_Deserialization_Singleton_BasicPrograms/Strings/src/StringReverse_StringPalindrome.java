import java.util.Scanner;

public class StringReverse_StringPalindrome {
	
	//Used length(),charAt() and equals()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		str = sc.nextLine();
		
		int length = str.length();
		
		String reverse = "";
		
		for(int i=length-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println(reverse);
		
		if(str.equals(reverse)) {
			System.out.println(str +" -Is a Palindrome");
		}
		else {
			System.out.println(str +" -Is not a palindrome");
		}
	}
}
