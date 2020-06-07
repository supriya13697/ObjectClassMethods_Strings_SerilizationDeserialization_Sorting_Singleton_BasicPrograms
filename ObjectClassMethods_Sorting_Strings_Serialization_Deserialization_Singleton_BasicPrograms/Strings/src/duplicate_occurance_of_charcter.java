import java.util.HashMap;
import java.util.Iterator;

public class duplicate_occurance_of_charcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "supriyareddykovvuri";
		String[] c = str.split("");
	
	    HashMap<String,Integer> map = new HashMap<>();
	    for(String s : c) {
	    	if(map.get(s) != null) {
	    		map.put(s, map.get(s)+1);
	    	}
	    	else {
	    	    map.put(s,1);
	    	}
	    }
	    Iterator<String> i = map.keySet().iterator();
	    while(i.hasNext()) {
	    	String temp = i.next();
	    	if(map.get(temp) > 1) {
	    		System.out.println("The duplicate letter is: " +temp + " and the count is " +map.get(temp));
	    	}
	    }
	}
}
