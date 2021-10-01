import java.util.Scanner;

public class Bai_28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if( a < b && b< c)
		{
			System.out.println( true );
		}
		else if( a > b && b >c )
		{
			System.out.println( true );
		}
		else
		{
			System.out.println( false );
		}
	}

}
