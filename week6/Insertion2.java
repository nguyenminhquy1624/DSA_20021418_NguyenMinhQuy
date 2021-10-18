import java.util.ArrayList;
import java.util.List;

public class Insertion2 {

	public static void insertionSort2(int n, List<Integer> arr) {
	    int [] a = new int[n];
	    for (int i = 0; i < n; i++) {
	    	a[i] = arr.get(i);
		}
	    for (int i = 1; i < n; i++) {
	    	int temp = a[i];
	    	int j = i-1;
	    	while (j>=0 && a[j] > temp) {
				a[j+1] = a[j];
				j--;
			}
	    	a[j+1] = temp;
	    for (int k = 0; k < n; k++) {
		    	System.out.print(a[k] + " ");
			}
		    System.out.println();
		}
	    
	 }
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(4);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(2);
		insertionSort2(arr.size(), arr);
	}

}
