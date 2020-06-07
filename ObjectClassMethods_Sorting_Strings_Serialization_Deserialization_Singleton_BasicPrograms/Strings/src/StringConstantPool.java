
public class StringConstantPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Supriya";//string constant pool
		String s2= "Supriya";
		String s3 = new String("Supriya");//obj ref heap
		String s4 = new String("Supriya");//obj ref heap
		//to add this string to the string literal pool
		String s5 = new String("Supriya").intern();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); //true
		System.out.println(s3==s4); //false
		System.out.println(s1==s3); //false
		System.out.println(s1==s5); //true
		System.out.println(s3==s5); //false

	}

}
