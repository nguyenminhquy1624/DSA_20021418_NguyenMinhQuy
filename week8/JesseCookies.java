import java.util.List;
import java.util.PriorityQueue;

public class JesseCookies {

	public static int cookies(int k, List<Integer> A) {
		int count = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 0; i < A.size(); i++) {
			queue.add(A.get(i));
		}
		while (queue.size() >= 2 && queue.peek() < k) {
			int x = queue.poll();
			int y = queue.poll();
			int mix = x + y;
			count++;
			queue.add(mix);
		}
		if (queue.peek() < k) {
			return -1;
		}
		return count;
	}

	public static void main(String[] args) {
		
		
	}

}
