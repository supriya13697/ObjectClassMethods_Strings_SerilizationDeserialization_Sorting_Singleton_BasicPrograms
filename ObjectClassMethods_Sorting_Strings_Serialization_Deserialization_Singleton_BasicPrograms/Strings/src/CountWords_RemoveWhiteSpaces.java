
public class CountWords_RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To count wors in a string
		String s = "My name is supriya";
		String arr[] = s.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		System.out.println(arr.length);

		//To remove white spaces(Use escape characters)

		String str = "Hi How are you";

		//only to remove spaces
		//str = str.replaceAll(" ", "");

		//onlt to remove tabs
		//str = str.replaceAll("\t", "");

		//To remove all spaces
		str = str.replaceAll("\\s", "");

		System.out.println(str);

	}

}
