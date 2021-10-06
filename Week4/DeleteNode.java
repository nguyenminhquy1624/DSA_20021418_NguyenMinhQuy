
public class DeleteNode {

	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
		SinglyLinkedListNode(int data) {
			this.data = data;
		}
	}
	
	public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
		
		if(llist == null) return llist;
		if(position == 0) return llist.next;
		SinglyLinkedListNode current = llist;
		while((position-1) > 0) {
			current = current.next;
			position--;
		}
		current.next = current.next.next;
		
		return llist;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
