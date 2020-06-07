package InterviewPrograms;

public class SwapNumbersProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		
//		int temp = a;
//		a = b;
//		b = temp;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
