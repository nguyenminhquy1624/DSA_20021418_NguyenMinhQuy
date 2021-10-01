
public class SherlockHomeArray {

	public static String balancedSums(int [] arr) {
	    if(arr.length == 1) return "YES";
	    int sum_arr = 0;
	    for(int i = 0 ; i < arr.length; i++)
	    {
	        sum_arr += arr[i];
	    }
	    int sumleft = 0;
	    for(int i = 0 ; i < arr.length; i++)
	    {
	        if( sumleft == ( sum_arr - arr[i] ) )
	            return "YES";
	        sumleft += arr[i];
	        sum_arr -= arr[i];
	    }
	    return "NO";
	}
	public static void main(String[] args) {
		
		int [] arr = { 1 ,1, 4, 1, 1 };
		
	}

}
