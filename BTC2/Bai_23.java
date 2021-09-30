import java.util.Scanner;

public class Bai_23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m = scanner.nextInt();
		int d = scanner.nextInt();
		if( m>3 && m<6 )
		{
			System.out.println("true");
		}
		else if( m==3 && d >= 20 )
		{
			System.out.println("true");
		}
		else if( m==6 && d <= 20 )
		{
			System.out.println("true");
		}
	}

}
