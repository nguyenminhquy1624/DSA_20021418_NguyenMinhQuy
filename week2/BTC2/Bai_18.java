import java.util.Scanner;

public class Bai_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		System.out.println(Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) ));
	}

}
