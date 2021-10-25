import java.util.Scanner;

public class CountingSort {

	
	public static void main(String[] args) {
		int [] arr = new int[100];
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr[a[i]]++;
		}
		for (int i = 0; i < 100; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
