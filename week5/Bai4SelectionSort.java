
public class Bai4SelectionSort {

	public static void print(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void SelectionSort(int[] arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			int indexmin = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					indexmin = j;
				}
			}
			if (indexmin != i) {
				int temp = arr[i];
				arr[i] = arr[indexmin];
				arr[indexmin] = temp;
			}
		}
		
		print(arr);
		
	}

	public static void main(String[] args) {
		int [] arr = {3,2,6,5,7,8,9};
		print(arr);
		System.out.println();
		SelectionSort(arr);
	}

}
