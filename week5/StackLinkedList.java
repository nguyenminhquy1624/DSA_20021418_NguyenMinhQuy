
public class StackLinkedList {
	
	
	private Node first;
	private int n;
	
	private class Node {
		String data;
		Node next;
		Node(String data) {
			this.data = data;
		}
	}

	public StackLinkedList() {
		first = null;
		n =0;
	}
	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return n;
	}
	
	public void push(String s) {
		Node newNode = new Node(s);
		if(isEmpty()) {
			first = newNode;
			n++;
		}
		else {
			newNode.next = first;
			first  = newNode;
		}
	}
	
	public String pop() {
		if(isEmpty()) {
			return "Danh sach rong";
		}
		else {
			String result = first.data;
			n--;
			first = first.next;
			return result;
		}
	}
	public void print() {
		Node head = first;
		while(head != null) {
			System.out.print("\t" + head.data);
			head = head.next;
		}
	}
	public static void main(String[] args) {
		StackLinkedList head = new StackLinkedList();
		
		head.print();
	}

}
