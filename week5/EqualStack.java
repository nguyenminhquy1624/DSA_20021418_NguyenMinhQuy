import java.util.List;
import java.util.Stack;

public class EqualStack {
	public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();
		int sum1 = 0, sum2 = 0, sum3 = 0;
		for (int i = 0; i < h1.size(); i++) {
			sum1 += h1.get(i);
			stack1.push(h1.get(i));
		}
		for (int i = 0; i < h2.size(); i++) {
			sum2 += h2.get(i);
			stack1.push(h2.get(i));
		}
		for (int i = 0; i < h3.size(); i++) {
			sum1 += h3.get(i);
			stack1.push(h3.get(i));
		}
		int sum =0;
		while (!stack1.isEmpty() && !stack2.isEmpty() && !stack3.isEmpty()) {
			sum = Math.min(sum1, Math.min(sum1, sum3));
			if(sum1 > sum) {
				sum1 -= stack1.pop();
			}
			if(sum2 > sum) {
				sum2 -= stack2.pop();
			}
			if(sum3 > sum) {
				sum3 -= stack3.pop();
			}
		}
		return sum;
	}

	public static void main(String[] args) {

	}

}
