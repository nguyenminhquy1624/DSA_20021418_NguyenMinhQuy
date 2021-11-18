import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

	private int n;
	private Node first;
	private Node last;

	private class Node {
		private Item item;
		private Node next;
		private Node prev;
	}

	public Deque() {
		n = 0;
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (n == 0);
	}

	public int size() {
		return n;
	}

	public void addFirst(Item item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		if (isEmpty()) {
            Node cur = new Node();
            cur.item = item;
            first = cur;
            last  = cur;
        }
        else {
            Node oldFirst = first;
            first = new Node();
            first.item = item;
            first.next = oldFirst;
            oldFirst.prev = first;
        }
        n++;
	}

	public void addLast(Item item) {
		if (item == null)   throw new IllegalArgumentException();
        if (isEmpty()) {
            Node cur = new Node();
            cur.item = item;
            first = cur;
            last  = cur;
        }
        else {
            Node oldLast = last;
            last = new Node();
            last.item = item;
            last.prev = oldLast;
            oldLast.next = last;
        }
        n++;
	}

	public Item removeFirst() {
		if (isEmpty())  throw new NoSuchElementException();
        Item item = first.item;
        first = first.next;
        // make sure that first.before always is null
        if (first != null)
            first.prev = null;
        else
            last = null;
        n--;
        return item;
	}

	public Item removeLast() {
		if (isEmpty())  throw new NoSuchElementException();
        Item item = last.item;
        last = last.prev;
        if (last != null)
            last.next = null;
        else
            first = null;
        n--;
        return item;
	}

	@Override
	public Iterator<Item> iterator() {
		return new Dequeiterator();
	}

	private class Dequeiterator implements Iterator<Item> {
		private Node current = first;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
		}

		@Override
		public Item next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			Item item = current.item;
			current = current.next;
			return item;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	public static void main(String[] args) {
		
	}
}
