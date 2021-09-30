
public class Bai_13 {

	public static void main(String[] args) {
		// day fibonacci
		int f = 0, g = 1;
		for (int i = 0; i <= 15; i++) {
		System.out.println(f);
		f = f + g;
		g = f - g;
		}

	}

}
