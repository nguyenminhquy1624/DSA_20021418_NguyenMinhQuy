import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ClosestNumber {

	public static List<Integer> closestNumbers(List<Integer> a) {
	    List<Integer> list = new ArrayList<>();
	    int n = a.size();
		int [] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	    	arr[i] = a.get(i);
		}
	    Arrays.sort(arr);
	    HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
	    int min = Integer.MAX_VALUE;
	    for (int i = 0; i < n-1; i++) {
	    	int current = Math.abs(arr[i] - arr[i+1]);
	    	if(current == min) {
					map.get(current).add(arr[i]);
					map.get(current).add(arr[i+1]);
			} else if (current < min) {
				List<Integer> x = new ArrayList<Integer>();
				x.add(arr[i]);
				x.add(arr[i+1]);
				map.put(current, x);
				min = current;
			}
		}
	    list = map.get(min);
		return list;
    }
	
	public static void main(String[] args) {
		

	}

}
