package InterviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfElementInArray_PrintDuplicateElements {

	public static void main(String[] args) {

		int[] a = {1,3,2,4,5,6,2,4,5,3,4,5,2,1};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		Arrays.stream(a).forEach(x -> {
			if(map.containsKey(x))
				map.put(x, map.get(x) + 1);
			else
				map.put(x,1);
		});
		
		System.out.println(map);
		
		
		//Print Duplicate Elements
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
