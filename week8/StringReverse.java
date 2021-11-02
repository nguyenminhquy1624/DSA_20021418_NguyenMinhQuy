import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int n = A.length();
		boolean kq = true;
		for (int i = 0; i <= (n / 2); i++) {
			if (A.charAt(i) != A.charAt(n - i - 1)) {
				kq = false;
				break;
			}
		}
		if (kq == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
