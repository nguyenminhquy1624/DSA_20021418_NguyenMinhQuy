import java.util.Scanner;

public class Bai_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if( (a%b == 0) || (b%a == 0) )
		{
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

}
