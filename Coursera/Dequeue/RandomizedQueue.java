import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {

	private int n;
	private Item[] arr;

	public RandomizedQueue() {
		n = 0;
		arr = (Item[]) new Object[1];
	}

	public boolean isEmpty() {
		return (n == 0);
	}

	public int size() {
		return n;
	}

	public void enqueue(Item item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		if (n == arr.length) {
			resize(2 * arr.length);
		}
		arr[n++] = item;
	}

	public Item dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}

		int random = StdRandom.uniform(n);
		Item item = arr[random];

		arr[random] = arr[--n];
		arr[n] = null;
		
		if (n == arr.length / 4 && n>0) {
			resize(arr.length / 2);
		}
		return item;
	}

	public Item sample() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		int random = StdRandom.uniform(n);
		return arr[random];
	}

	private void resize(int cap) {
		Item[] copy = (Item[]) new Object[cap];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		arr = copy;
	}

	@Override
	public Iterator<Item> iterator() {
		return new Randomiterator();
	}

	private class Randomiterator implements Iterator<Item> {
		private int cur ;
		private Item[] iterQueue;

		public Randomiterator() {
			cur = n;
			iterQueue = (Item[]) new Object[cur];
		}

		@Override
		public boolean hasNext() {
			return cur != 0;
		}

		@Override
		public Item next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			int random = StdRandom.uniform(cur);
            Item item = iterQueue[random];
            iterQueue[random] = iterQueue[--cur];
            return item;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	public static void main(String[] args) {
		
	}

}
