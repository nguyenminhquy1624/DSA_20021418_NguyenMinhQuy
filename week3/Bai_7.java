import java.util.Arrays;

public class Bai_7 {

	public static void main(String[] args) {
		
		int [] arr = { -3,-7,9,10,-5,5,-8,4,3,0,2,9,10};
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length-2; i++)
		{
			int left = i+1;
			int right = arr.length-1;
			while (left < right) {
				if((arr[i] + arr[left] + arr[right]) == 0)
				{
					System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
					left++;
					right--;
				}
				else if( arr[i] + arr[left] + arr[right] > 0 )
				{
					right--;
				}
				else {
					left++;
				}
			}
		}
	}

}
