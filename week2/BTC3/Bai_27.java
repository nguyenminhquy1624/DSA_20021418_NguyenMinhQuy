import java.util.Scanner;

public class Bai_27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i =0 ; i <n ; i++)
		{
			if( i%2 !=0 )
			{
				for(int j = 0; j < n; j ++)
				{
					System.out.print(" "+"*");
				}
			}
			else
			{
				for(int j = 0; j < n; j ++)
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}

	}

}
