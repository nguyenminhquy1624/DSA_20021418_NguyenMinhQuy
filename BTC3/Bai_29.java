import java.util.Scanner;

public class Bai_29 {

	public static int gcd(int x,int y)
	{
		while( x*y !=0 )
		{
			if( x>y )
				x%=y;
			else
				y%=x;
		}
		return (x+y);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i =1 ; i <= n; i++)
		{
			for(int j =1 ; j <= n; j++)
			{
				if( gcd(i, j) == 1 )
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
