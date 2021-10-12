import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

	public static class Editor {
		Stack<String> stack = new Stack<String>();
		String text = "";

		public void append(String str) {
			stack.push(str);
			text = text.concat(str);
		}

		public void delete(int k) {
			stack.push(text);
			text = text.substring(0, text.length() - k);
		}

		public char get(int k) {
			return text.charAt(k - 1);
		}

		public void undo() {
			text = stack.pop();
		}
	}

	public static void main(String[] args) {
		Editor editor = new Editor();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			switch (x) {
			case 1: {
				editor.append(sc.next());
				break;
			}
			case 2: {
				editor.delete(sc.nextInt());
				break;
			}
			case 3: {
				System.out.println(editor.get(sc.nextInt()));
				break;
			}
			case 4: {
				editor.undo();
				break;
			}
			}
		}
	}
}
