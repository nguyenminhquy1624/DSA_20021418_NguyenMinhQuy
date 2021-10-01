import java.util.Arrays;
import java.util.Iterator;

public class Bai1_ThreeSum {
	
	public static int binary(int [] a, int num , int l , int r) {
		if( l > r )
		{
			return -1;
		}
		int mid =  (l+r)/2;
		if( a[mid] == num ) 
		{
			return mid;
		}
		else if(a[mid] < num)
		{
			return binary(a, num, l, (mid-1));
		}
		return binary(a, num, mid + 1, r);
	}
	public static void Trisum(int [] a ) {
		Arrays.sort(a);
		for(int i = 0 ; i < a.length ; i ++)
		{
			for(int j = i+1 ; j < a.length ; j++)
			{
				int num = -(a[i] + a[j]);
				int x = binary(a, num, j+1, a.length-1);
				if( x != -1 )
				{
					System.out.println(a[i] + " " + a[j] + " " + a[x] );
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] a = {-3,-1,6,-6,0,1,4,9,10};
		Trisum(a);
	}

}
