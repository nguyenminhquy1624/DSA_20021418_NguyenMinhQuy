
public class CompareLinkList {

	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;

		SinglyLinkedListNode(int data) {
			this.data = data;
		}
	}

	static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		if (head1 == null && head2 == null)
			return true;
		while (head1 != null && head2 != null) {
			if (head1.data != head2.data) {
				break;
			}
			if (head1.next == null && head2.next == null) {
				return true;
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
