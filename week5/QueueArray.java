import java.util.Iterator;

public class QueueArray {

	private static final int SIZE = 10;
	private String[] arr;
	private int n;
	private int first;
	private int last;

	public QueueArray() {
		arr = new String[SIZE];
		n = 0;
		first = 0;
		last = SIZE -1;
	}

	public boolean isFull() {
		return n == SIZE;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int size() {
		return n;
	}

	public void push(String s) {
		if (isFull()) {
			System.out.println("Queue da day");
		}
		last = (last + 1) % SIZE;
		arr[last] = s;
		n++;
		
	}

	public String pop() {
		if (isEmpty()) {
			return "Queue dang rong";
		}
		String result = arr[first];
		arr[first] = null;
		n--;
		first = (first + 1) % SIZE;
		return result;
	}

	public void print() {
		System.out.println(first);
		System.out.println(last);
		do {
			System.out.print(arr[(first%SIZE)] + " ");
			//first++;
		}
		while(((first++ %SIZE) != last));
		System.out.println();
	}
	

	public static void main(String[] args) {
		QueueArray arr = new QueueArray();
		

	}

}
