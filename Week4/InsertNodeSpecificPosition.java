
public class InsertNodeSpecificPosition {

	
	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
		SinglyLinkedListNode(int data) {
			this.data = data;
		}
	}
	
	public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		SinglyLinkedListNode current = head;
		int index = 0;
		while(index < (position -1)) {
			current = current.next;
			index++;
		}
		newNode.next = current.next;
		current.next = newNode;
		return head;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
