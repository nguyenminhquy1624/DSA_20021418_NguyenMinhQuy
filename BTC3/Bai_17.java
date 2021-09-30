import java.util.Scanner;

public class Bai_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		int k = scanner.nextInt();
		if( k !=0 )
		{
			System.out.println(Math.pow(c, 1.0/k));
		}
	}

}
