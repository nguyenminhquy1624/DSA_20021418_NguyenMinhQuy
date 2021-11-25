import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingNumber {

	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.size(); i++) {
			if(map1.containsKey(arr.get(i))) {
				map1.put(arr.get(i), map1.get(arr.get(i)) + 1);
			} else {
				map1.put(arr.get(i), 1);
			}
		}
		for (int i = 0; i < brr.size(); i++) {
			if(map2.containsKey(brr.get(i))) {
				map2.put(brr.get(i), map2.get(brr.get(i)) + 1);
			} else {
				map2.put(brr.get(i), 1);
			}
			
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i : map2.keySet()) {
			if(map1.containsKey(i)) {
				if(map2.get(i) > map1.get(i)) {
					list.add(i);
				}
			} else {
				list.add(i);
			}
		}
		Collections.sort(list);
		return list;
	}
	

}
