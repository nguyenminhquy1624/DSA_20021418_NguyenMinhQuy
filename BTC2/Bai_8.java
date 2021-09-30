import java.util.Scanner;

public class Bai_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		double temp;
		double sr = num/2;
		do {
			temp = sr;
			sr = (temp+(num/temp))/2;
		}
		while( (temp-sr) != 0 );
			System.out.println(sr); // 1.414213562373095
	}
}
