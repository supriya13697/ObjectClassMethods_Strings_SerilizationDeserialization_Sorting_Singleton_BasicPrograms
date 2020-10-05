package InterviewPrograms;

public class MaskString {
	
	private static String maskString(String str,int start, int end) {
		
		StringBuilder newstr = new StringBuilder();
		for(int i=start;i<=end;i++) {
			newstr.append("*");
		}
		return str.substring(0,start-1) + newstr + str.substring(end, str.length());
	}
	
	public static void main(String args[]) {
		System.out.println("new string"+maskString("1234567891011111",7,12));
	}

}
