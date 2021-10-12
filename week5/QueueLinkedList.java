
public class QueueLinkedList {

	private Node first;
	private Node last;
	private int n;

	private class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
		}
	}

	public QueueLinkedList() {
		first = null;
		last = null;
		n = 0;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return n;
	}

	public String deQueue() {
		if (isEmpty()) {
			return "Danh sach rong";
		} else {
			String result = first.data;
			Node delete = first;
			first = first.next;
			delete = null;
			n--;
			return result;
		}
	}

	public void enQueue(String name) {
		Node newNode = new Node(name);
		if (isEmpty()) {
			last = newNode;
			first = last;
			n++;
		} else {
			last.next = newNode;
			last = newNode;
			n++;
		}
	}

	public void print() {
		Node x = first;
		while (x != null) {
			System.out.print(x.data + " \t");
			x = x.next;
		}
	}

	public static void main(String[] args) {
		QueueLinkedList head = new QueueLinkedList();
		
		
	}

}
