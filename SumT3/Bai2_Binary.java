
public class Bai2_Binary {
	public static int binarySearch(int [] a , int number)
	{
		int index;
		
		int l = 0;
		int r = a.length-1;
		
		while(l <= r) {
			index = (l+r)/2;
			if(a[index] == number) {
				return index;
			}
			else if(a[index] > number)
			{
				r = index - 1;
			}
			else
			{
				l = index+1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9 } ;
		System.out.println(binarySearch(arr, 2));
	}

}
