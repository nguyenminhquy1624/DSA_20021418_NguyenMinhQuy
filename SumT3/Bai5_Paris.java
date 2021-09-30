import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Bai5_Paris {

	public static int pairs(int k , List<Integer> arr) {
		int count =0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0 ; i< arr.size(); i++)
		{
			set.add(arr.get(i));
		}
		for(int i =0 ; i < arr.size(); i++)
		{
			if( set.contains(arr.get(i)+k) )
			{
				count++;
			}
		}
		return count;
    }
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k =2;
		System.out.println(pairs(2, arr));
	}
}
