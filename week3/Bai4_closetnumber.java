import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Bai4_closetnumber {
	
	public static List<Integer> closestNumbers(List<Integer> arr) {
		int b[] = new int[arr.size()];
		for(int i = 0 ; i < arr.size(); i++)
		{
			b[i] = arr.get(i);
		}
	    Arrays.sort(b);
	    int minkey = Integer.MAX_VALUE;
		HashMap<Integer, List<Integer>> a = new HashMap<Integer, List<Integer>>();
		for(int i = 0 ; i < b.length-1; i++)
		{
			int mincurrent = b[i+1] - b[i];
			if( mincurrent == minkey )
			{
				a.get(minkey).add(b[i]);
				a.get(minkey).add(b[i+1]);
			}
			else if( mincurrent < minkey )
			{
				List<Integer> x = new ArrayList<Integer>();
				x.add(b[i]);
				x.add(b[i+1]);
				a.put(mincurrent, x);
				minkey = mincurrent;
			}
		}
		List<Integer> resul = new ArrayList<Integer>();
		resul = a.get(minkey);
		return resul;
	    }

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println(closestNumbers(arr));
	}

}
