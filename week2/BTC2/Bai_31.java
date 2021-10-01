import java.util.Scanner;

public class Bai_31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double lamda_0 = scanner.nextDouble();
		double phi = scanner.nextDouble();
		double lamda = scanner.nextDouble();
		double x = lamda - lamda_0;
		double y = 0.5*(Math.log((1+Math.sin(phi))/(1-Math.sin(phi))));
		System.out.println("x = "+x + " y = "+y);
	}

}
