import java.util.Scanner;

public class Bai_24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int P = scanner.nextInt();
		int r = scanner.nextInt();
		int t = scanner.nextInt();
		
		double r_ = 1.0*r/1200;
		int N = t*12;
		
		double c = (r_*P)/( 1 - (Math.pow(1+r_,-N)));
		System.out.println(c);
	}

}
