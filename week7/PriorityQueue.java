;

public class PriorityQueue {
	private static int MAX = 10;
	private static int[] arr = new int[MAX];
	private static int n = 0;

	
	public static void insert(int value) {
		if(n==0) {
			arr[0] = value;
			n++;
			return;
		}
		int i;
		for ( i = n-1; i >=0; i--) {
			if(value > arr[i]) {
				arr[i+1] = arr[i];
			}
			else {
				break;
			}
		}
		arr[i+1] = value;
		n++;
		return;
	}
	public static int delete() {
		return arr[--n];
	}
	public static boolean isFull() {
		return n== MAX;
	}
	public static boolean isEmpty() {
		return n==0;
	}
	public static int peek() {
		return arr[n-1];
	}
	public static void printpriQueue() {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	public static void main(String[] args) {
		insert(10);
		insert(9);
		insert(11);
		insert(1);
		insert(99);
		printpriQueue();
		System.out.println();
		System.out.println(delete());
		printpriQueue();
	}

}
