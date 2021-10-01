
public class Bai_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123456789;
		int m = 0;
		while (n != 0) {
		m = (10 * m) + (n % 10);
		n = n / 10;
		}
		System.out.println(m + "\t" + n );
	}

}
