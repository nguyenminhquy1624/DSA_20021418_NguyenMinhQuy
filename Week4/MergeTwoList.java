
public class MergeTwoList {

	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;

		SinglyLinkedListNode(int data) {
			this.data = data;
		}
	}

	public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		SinglyLinkedListNode current = null;
		SinglyLinkedListNode head = null;
		if (head1.data < head2.data) {
			head = head1;
			head1 = head1.next;
		} else {
			head = head2;
			head2 = head2.next;
		}
		current = head;
		while (head1 != null && head2 != null) {
			if (head1.data > head2.data) {
				current.next = head2;
				head2 = head2.next;
			} else {
				current.next = head1;
				head1 = head1.next;
			}
			current = current.next;
		}
		if (head1 == null) {
			current.next = head2;
		} else {
			current.next = head1;
		}
		return head;
	}

	public static void printElement(SinglyLinkedListNode head) {

		if (head == null)
			return;
		else {
			while (head != null) {
				System.out.println(head.data);
				head = head.next;
			}
		}

	}
	
	public static void main(String[] args) {
		SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
		SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
		SinglyLinkedListNode n3 = new SinglyLinkedListNode(3);
		SinglyLinkedListNode n4 = new SinglyLinkedListNode(4);
		SinglyLinkedListNode n5 = new SinglyLinkedListNode(5);
		SinglyLinkedListNode n6 = new SinglyLinkedListNode(6);

		n1.next = n2;
		n2.next = n5;
		n3.next = n4;
		n4.next = n6;
		
		SinglyLinkedListNode list = mergeLists(n1, n3);
		
		printElement(list);
	}

}
