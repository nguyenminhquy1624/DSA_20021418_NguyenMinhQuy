import java.util.Scanner;
import java.util.Stack;

public class Bai3QueueTwoStack {

	public static class MyQueue<T> {
		
		private Stack<T> Stackold = new Stack<T>();
		private Stack<T> StackNew = new Stack<T>();
		
		public void enqueue(T value) {
			StackNew.push(value);
		}
		
		public void shiftStack() {
			if(Stackold.isEmpty()) {
				while (!StackNew.isEmpty()) {
					Stackold.push(StackNew.pop());
				}
			}
		}
		
		public T peek() {
			shiftStack();
			return Stackold.peek();
		}
		public T dequeue() {
			shiftStack();
			return Stackold.pop();
		}
	}
	
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        for (int i = 0; i < n; i++) {
	            int x = sc.nextInt();

	            switch (x) {
	                case 1:
	                    queue.enqueue(sc.nextInt());
	                    break;
	                case 2:
	                    queue.dequeue();
	                    break;
	                case 3:
	                    System.out.println(queue.peek());
	                    break;
	            }
	        }
	    }
	}

}
