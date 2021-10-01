import java.util.Scanner;

public class Bai_22 {

	public static void main(String[] args) {
		final  double g = 9.800722;
		Scanner scanner = new Scanner(System.in);
		double x0 = scanner.nextDouble();
		double v0 = scanner.nextDouble();
		double t = scanner.nextDouble();
		double x = x0 + v0*t + (g*t*t)/2;
		
		System.out.println(x);
	}

}
