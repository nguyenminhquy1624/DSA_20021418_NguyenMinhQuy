import java.util.ArrayList;

import edu.princeton.cs.algs4.In;

public class Bai_4 {

	public static void main(String[] args) {
		In in = new In("C:/Users/MINH QUY/Documents/JAVA_ECLIPSE/Data_Structures_Algorithms/algs4-data/algs4-data/test1.txt"); 
	    int[] a = in.readAllInts();
	    ArrayList<Integer> arr = new ArrayList<>();
	    for(int i = 1 ; i< a.length;i++)
	    {
	    	arr.add(a[i]);
	    }
	    
	    arr.sort(null);
	    for(int i =0 ; i < arr.size()-2;i++)
	    {
	    	int l = i+1;
	    	int r = arr.size()-1;
	    	while( l<r )
	    	{
	    		if( (arr.get(i) + arr.get(l) + arr.get(r)) ==0 )
	    		{
	    			System.out.println(arr.get(i)+" " + arr.get(l) + " " + arr.get(r));
	    			l++;
	    			r--;
	    		}
	    		else if( (arr.get(i) + arr.get(l) + arr.get(r)) < 0 )
	    		{
	    			l++;
	    		}
	    		else
	    		{
	    			r--;
	    		}
	    	}
	    }

	}

}
