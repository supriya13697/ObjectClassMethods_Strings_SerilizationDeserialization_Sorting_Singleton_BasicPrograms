
public class StringToInteger_IntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		//Integer stores in 32 bits - Binary code (with 2 jarfunction...)
		//String stores in Unicode
		
		//Converting Integer to String
		int x = 10; //1010 
		String y = Integer.toString(x);
		System.out.println(x);
		System.out.println(y);
		
		
		//Converting string to integer
		String s = "20";
		int i = Integer.parseInt(s);
		System.out.println(s);
		System.out.println(i);
	}
}
