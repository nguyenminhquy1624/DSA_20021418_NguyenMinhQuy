
public class QuickSort1 {

	public static void Partion(int[] arr, int left, int right, int pivot) {
		int i = left + 1;
		int j = right;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
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

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 3, 7, 2 };
		Partion(arr, 0, arr.length-1, arr[0]);
	}

}
