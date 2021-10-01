import java.util.Scanner;

public class Bai_25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double Ta = scanner.nextDouble();
		double V = scanner.nextDouble();
		
		double Twc = 13.12 + 0.625*Ta-13.37*(Math.pow(V, 0.16))+0.3965*Ta*(Math.pow(V, 0.16));
		System.out.println(Twc);
	}

}
