import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindRunningMedian {

	public static List<Double> runningMedian(List<Integer> a) {
		List<Double> list = new ArrayList<Double>();
		PriorityQueue<Double> pq1 = new PriorityQueue<Double>(Comparator.reverseOrder());
		PriorityQueue<Double> pq2 = new PriorityQueue<Double>();
		pq1.add(a.get(0)*1.0);
		list.add(pq1.peek());
		for (int i = 1; i < a.size(); i++) {
			if (pq1.size() > pq2.size()) {
				pq2.add(a.get(i) * 1.0);
			} else {
				pq1.add(a.get(i) * 1.0);
			}
			while (pq1.peek() > pq2.peek()) {
				double x = pq1.poll();
				double y = pq2.poll();
				pq1.add(y);
				pq2.add(x);
			}
			if (pq1.size() > pq2.size()) {
				list.add(pq1.peek());
			} else {
				list.add((pq1.peek() + pq2.peek()) / 2);
			}
		}
		return list;
	}

	public static void main(String[] args) {

	}

}
