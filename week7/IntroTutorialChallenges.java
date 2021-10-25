
public class IntroTutorialChallenges {

	public static int Binary(int[] arr, int left, int right, int number) {
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == number) {
				return mid;
			} else if (arr[mid] > number) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		return -1;
	}

	public static int BinaryRecusion(int[] arr, int left, int right, int number) {
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;
		if(arr[mid] == number) {
			return mid;
		}
		else if(arr[mid] > number)
		{
			return BinaryRecusion(arr, left, mid-1, number);
		}
		return BinaryRecusion(arr, mid+1, right, number);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 6, 7, 9, 10 };
		System.out.println(Binary(arr, 0, arr.length - 1, 1));
		System.out.println(BinaryRecusion(arr, 0, arr.length-1, 1));
	}

}
