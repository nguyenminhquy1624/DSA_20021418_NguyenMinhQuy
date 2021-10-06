
public class PrintReverse {
	
	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
		SinglyLinkedListNode(int data) {
			this.data = data;
		}
	}
	public static void reversePrint(SinglyLinkedListNode llist) {
	    if(llist.next == null)
	    {
	    	System.out.println(llist.data);
	    }
	    else {
			reversePrint(llist.next);
			System.out.println(llist.data);
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
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		reversePrint(n1);
	}

}
