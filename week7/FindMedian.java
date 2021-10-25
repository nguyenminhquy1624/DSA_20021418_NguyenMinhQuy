import java.util.Random;

public class FindMedian {

	
	public static int Find(int[] arr, int left, int right, int n) {
		int i = left + 1;
		int j = right;
		int pivot = arr[left]; // //6 4 5 piv = 6 l = 4 r = 5
		while (i <= j) {
			while (i <= right && arr[i] < pivot) {
				i++;
			}
			while (j >= left && arr[j] > pivot) {
				j--;
			}
			if (i < j) {
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
		if (j == n) {
			return arr[j];
		} else {
			if (j < n) {
				return Find(arr, j + 1, right, n);
			} else {
				return Find(arr, left, j - 1, n);
			}
		}
	}

	private static void Shuffle(int[] arr) {
		Random random = new Random();
		for (int i = 1; i < arr.length; i++) {
			int x = random.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[x];
			arr[x] = temp;
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) { 
		int[] arr = { 3, 7, 1, 2, 8, 5, 6, 4, 9 }; 
		Shuffle(arr);
		print(arr);
		System.out.println();
		int key = Find(arr, 0, arr.length - 1, 4);
		System.out.println(key);
	}

}
