import java.util.ArrayList;
import java.util.List;

public class Insertion1 {

	public static void insertionSort1(int n, List<Integer> arr) {
		// Write your code here
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = arr.get(i);
		}
		int min = a[n-1];
		for (int i = n - 1; i >=0 ; i--) {
			
			if(i ==0){
				a[i] = min;
				break;
			} else if(min > a[i-1]) {
				a[i] = min;
				break;
			}
			else if(min > a[i]) {
				break;
			}
			else {
				a[i] = a[i-1];
			}
			for (int j = 0; j < n; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		
		for (int j = 0; j < n; j++) {
			System.out.print(a[j] + " ");
		}
	}
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(8);
		arr.add(5);
		insertionSort1(arr.size(), arr);

	}

}
