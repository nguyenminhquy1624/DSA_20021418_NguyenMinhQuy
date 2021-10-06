
public class addTailNode {

	public static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}
	
	public static Node insertNodeAtTail(Node head , int data) {
		Node newNode = new Node(data);
		if(head == null) 
		{
			head = newNode;
			return head;
		}
		else {
			Node currentNode = head;
			while (currentNode.next != null ) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			return head;
		}
	}
	
	public static void main(String[] args) {
		
	}

}
