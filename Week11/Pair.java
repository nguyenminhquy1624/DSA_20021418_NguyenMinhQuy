import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pair {
	public static int pairs(int k, List<Integer> arr) {
		
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			set.add(arr.get(i));
		}
		for (int i = 0; i < arr.size(); i++) {
			if(set.contains(arr.get(i) + k)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
	}
}
