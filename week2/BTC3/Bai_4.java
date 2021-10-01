import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		if( ( x > 0 && x < 1 ) && ( y > 0 && y < 1))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

}
