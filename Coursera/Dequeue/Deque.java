import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

	private int n;
	private Node first;
	private Node last;

	/**
	 * Tạo 1 class Node
	 */
	private class Node {
		private Item item;
		private Node next;
		private Node prev;
	}

	/**
	 * Khởi tạo các giá trị cho queue
	 * first và last là null, số phần tử n = 0
	 */
	public Deque() {
		n = 0;
		first = null;
		last = null;
	}

	/**
	 * Kiểm tra xem queue có rỗng hay không
	 * @return nếu queue rỗng trả về true nếu không trả về false
	 */
	public boolean isEmpty() {
		return (n == 0);
	}

	/**
	 * 
	 * @return trả về kích thước của queue
	 */
	public int size() {
		return n;
	}

	/**
	 * Thêm vào đầu của queue
	 * @param item : Dữ liệu thêm vào là item
	 */
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

	/**
	 * Thêm vào cuối của queue
	 * @param item là dữ liệu được thêm vào
	 */
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

	/**
	 * Xóa phần tử đầu tiên của queue
	 * @return trả về phần tử đã xóa đầu tiên của dãy 
	 */
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

	/**
	 * Xóa phần tử cuối cùng của queue
	 * @return trả về phần tử đã xóa ở cuối cùng của queue
	 */
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
