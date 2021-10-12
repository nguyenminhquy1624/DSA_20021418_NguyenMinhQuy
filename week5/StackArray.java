import java.util.Iterator;

public class StackArray {

	private static final int SIZE = 10;
	private String[] arr;
	private int n;

	public StackArray() {
		arr = new String[SIZE];
		n = 0;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public boolean isFull() {
		return n == SIZE;
	}

	public int size() {
		return n;
	}

	public void push(String s) {
		if (isFull()) {
			System.out.println("Stack sach da day");
		}
		arr[n++] = s;
	}
	public String pop() {
		if (isEmpty()) {
			return "Stack dang rong";
		}
		return arr[--n];
	}
	public void print() {
		for(String s : arr) {
			System.out.print(s + " ");
		}
	}
	public static void main(String[] args) {
		StackArray arr = new StackArray();
		
	}

}
