import java.util.HashMap;
import java.util.Iterator;

public class duplicate_occurance_of_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Hi Hi I am supriya and myself supriya and I am working in Capgemini";
		String words[] = sentence.split(" ");
		
		HashMap<String,Integer> map = new HashMap<>();
		for(String tempString : words ) {
			if(map.get(tempString) != null) {
				map.put(tempString, map.get(tempString)+1);
			}
			else {
				map.put(tempString, 1);
			}
		}
		System.out.println(map);
		
		Iterator<String> i = map.keySet().iterator();
		while(i.hasNext()) {
			String temp = i.next();
			if(map.get(temp) > 1) {
				System.out.println("The duplicate key is " +temp +" and the occurance of word is "+map.get(temp));
			}
		}
	
	}

}
