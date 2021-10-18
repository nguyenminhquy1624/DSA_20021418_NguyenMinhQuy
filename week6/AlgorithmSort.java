import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlgorithmSort {

	public static void InsertionSort(int[] arr) {

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i-1;
			while (j >=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		printArray(arr);
	}

	public static void Merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = arr[mid + i + 1];
		}
		int i = 0, j = 0, k = left;
		while (i < n1 || j < n2) {
			if (j >= n2) {
				arr[k] = L[i++];
			} else if (i >= n1) {
				arr[k] = R[j++];
			} else if (L[i] <= R[j]) {
				arr[k] = L[i++];
			} else {
				arr[k] = R[j++];
			}
			k++;
		}
	}

	public static void MergeSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		MergeSort(arr, left, mid);
		MergeSort(arr, mid + 1, right);
		Merge(arr, left, mid, right);

	}

	public static void Shuffle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			Random rand = new Random();
			int x = rand.nextInt(i + 1);
			int temp = arr[i];
			arr[i] = arr[x];
			arr[x] = temp;
		}
	}

	public static int Partition(int[] arr, int left, int right, int key) {
		while (left <= right) {
			while (arr[left] < key && left <= right) {
				left++;
			}
			while (arr[right] > key && left <= right) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}

	public static void QuickSort(int[] arr, int left, int right) {
		if (left < right) {
			int key = arr[(left + right) / 2];
			int k = Partition(arr, left, right, key);
			QuickSort(arr, left, k - 1);
			QuickSort(arr, k, right);
		}

	}

	

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {1,0, 2,4,9,1,0,6,8,3 };
		//Shuffle(arr);
		printArray(arr);
		System.out.println();
		InsertionSort(arr);

		printArray(arr);
		
		
	}

}
