
public class QuickSortInPlace {
	
	public static void swap(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	public static int Partion(int [] arr , int left , int right) {
		int i = left+1;
		int j = right;
		int pivot = arr[left];
		while (i<=j) {
			while (arr[i] < pivot && i<=j) {
				i++;
			}
			while (arr[j] > pivot && i<=j) {
				j--;
			}
			if(i<=j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		int temp = arr[left];
		arr[left] = arr[j];
		arr[j] = temp;
		
		return j;
	}
	public static void QuickSort(int [] arr, int left, int right) {
		if(left >= right) {
			return;
		}
		int k = Partion(arr, left, right);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		QuickSort(arr, left, k-1);
		QuickSort(arr, k+1, right);
		
	}
	public static void main(String[] args) {
		
		int [] arr = {3,5,2,7,9,1,5}; //1 2 3 5 5 7 9
		QuickSort(arr, 0 , arr.length-1);
	}

}
