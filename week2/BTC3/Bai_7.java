import java.util.Scanner;

public class Bai_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for(int i =1 ;i <= x; i++)
		{
			if( i==1 )
			{
				System.out.println("1st Hello");
			}
			if( i==2 )
			{
				System.out.println("2nd Hello");
			}
			if( i==3 )
			{
				System.out.println("3rd Hello");
			}
			else
			{
				System.out.println(i+"th Hello");
			}
		}

	}

}
