import java.util.Scanner;

public class Bai_33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double X1 = scanner.nextDouble();
		double Y1 = scanner.nextDouble();
		double X2 = scanner.nextDouble();
		double Y2 = scanner.nextDouble();
		double delta = Y1 - Y2;
		double p1 = Math.cos(X2) * Math.sin(delta);
		double p2 = Math.cos(X1) * Math.sin(X2) - Math.sin(X1) * Math.cos(X2) * Math.cos(delta);
		double p3 = Math.sin(X1) * Math.sin(X2) + Math.cos(X1) * Math.cos(X2) * Math.cos(delta);
		double distance = 60 * Math.atan2(Math.sqrt(p1*p1 + p2*p2), p3);
		System.out.println(distance);
	}

}
