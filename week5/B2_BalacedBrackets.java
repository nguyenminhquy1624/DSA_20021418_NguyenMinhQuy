import java.util.Iterator;
import java.util.Stack;

public class B2_BalacedBrackets {

	public static String isBalanced(String s) {
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || (s.charAt(i) == '{') || (s.charAt(i) == '[')) {
				st.push(s.charAt(i));
			} else {
				if (st.isEmpty()) {
					return "NO";
				} else {
					char kq = st.pop();

					if (s.charAt(i) == ')' && kq != '(') {
						return "NO";
					} else if (s.charAt(i) == '}' && kq != '{') {
						return "NO";
					} else if (s.charAt(i) == ']' && kq != '[') {
						return "NO";
					}
				}
			}
		}
		if (st.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}

	}

	public static void main(String[] args) {
		
		
	}

}
