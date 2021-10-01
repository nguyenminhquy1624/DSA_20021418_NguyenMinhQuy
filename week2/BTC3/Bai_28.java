import java.util.Scanner;

public class Bai_28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		while( x*y !=0 )
		{
			if( x>y )
				x%=y;
			else
				y%=x;
		}
		System.out.println(x+y);
	}

}
