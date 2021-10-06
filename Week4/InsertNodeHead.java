
public class InsertNodeHead {

	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
		SinglyLinkedListNode(int data) {
			this.data = data;
		}
	}
	
	public static SinglyLinkedListNode Inserthead(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		
		if(head == null) {
			head = newNode;
			return head;
		}
		else {
			newNode.next = head;
			head = newNode;
			return head;
		}
	}
	
	public static void main(String[] args) {
		

	}

}
