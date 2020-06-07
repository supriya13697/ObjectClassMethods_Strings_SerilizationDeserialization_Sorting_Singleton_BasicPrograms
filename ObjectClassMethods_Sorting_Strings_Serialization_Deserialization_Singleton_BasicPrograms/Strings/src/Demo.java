public class Demo {
	public static void main(String[] args) {

		//String Literal
		String str = "Supriya Kovvurip";

		//Using new keyword
		String str1 = new String("Reddy");

		char c[]= {'P','r','i','y','a'};
		System.out.println(c);

		//Converting char array to string
		String str2 = new String(c);

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("----------------------------------");

		//To find the string length
		System.out.println(str.length());
		System.out.println("----------------------------------");

		//Converting to Upper Case & Lower Case
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println("----------------------------------");

		//Finding character or index in a string
		System.out.println(str.indexOf('i'));
		System.out.println(str.lastIndexOf('i'));
		System.out.println("----------------------------------");

		//Returns character in a string
		System.out.println(str.charAt(2));
		System.out.println("----------------------------------");

		//Concatenate two strings
		System.out.println(str+""+str1);
		System.out.println(str.concat(str1));
		String a= "10";
		String b= "20";
		System.out.println(a+b);
		System.out.println("----------------------------------");

		//Special Characters -- Use backslash
		String s = "It\'s me \"supriya\" reddy";
		System.out.println(s);
		System.out.println("----------------------------------");

		//To compare two strings...will check ascii values internally not the length
		String str3 = "supriyakovvuri";
		System.out.println(str.compareTo(str3)); //string1<string2 returns negative
		System.out.println(str.compareToIgnoreCase(str3)); //string1==string2 returns 0
		System.out.println("----------------------------------");

		//equals---content comparison
		System.out.println(str.equals(str3));
		System.out.println(str.equalsIgnoreCase(str3));
		String str4 = new String("reddy");
		System.out.println(str1.equalsIgnoreCase(str4));
		System.out.println("----------------------------------");

		//Startswith and endswith
		System.out.println(str.endsWith("dy"));
		System.out.println(str.startsWith("su"));
		System.out.println("----------------------------------");

		//String replace
		System.out.println(str.replace('p', 'b'));
		String sup = "My name is supriya and i like my name";
		System.out.println(sup.replaceFirst("name", "id"));
		System.out.println(sup.replaceAll("name", "id"));
		System.out.println("----------------------------------");

		//Substring
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 9));
		System.out.println("----------------------------------");

		//to trim the spaces at extremes.
		String abc = " This is super trim  ";
		System.out.println(abc.trim());
		System.out.println("----------------------------------");

		//Returns Unicode
		System.out.println(str.codePointAt(6));
		System.out.println(str.codePointBefore(7));
		System.out.println(str.codePointCount(1, 7));
		System.out.println("----------------------------------");

		//main string contains substring or not
		System.out.println(str.contains("riya"));
		System.out.println("----------------------------------");

		//Checks whether a string contains the exact same sequence of characters of the specified CharSequence 
		System.out.println(str.contentEquals(str3));
		System.out.println("----------------------------------");

		//checks whether the String is matching with the specified regular expression 
		System.out.println(str.matches("Supriya"));
		System.out.println("----------------------------------");

		//split function
		String sss = "Supriya,Srujana,Bindu,Sathvik,Vamsi,Kiran";
		String arrSplit[] = sss.split(",");
		for (int i=0; i < arrSplit.length; i++)
		{
			System.out.println(arrSplit[i]);
		}
		System.out.println("----------------------------------");
		String trial = "We are all good friends";
		String[] arr = trial.split(" ");
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------------");
	}
}