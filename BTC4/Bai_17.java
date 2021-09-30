import java.util.Random;
import java.util.Scanner;

public class Bai_17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int arr1[][] = new int[x][y];
		int arr2[][] = new int[a][b];
		int arr[][] = new int[x][b];
		for(int i = 0 ; i < x ; i++)
		{
			for(int j = 0 ; j < y ; j++)
			{
				arr1[i][j] = rand.nextInt(9);
			}
		}
		for(int i = 0 ; i < a ; i++)
		{
			for(int j = 0 ; j < b ; j++)
			{
				arr2[i][j] = rand.nextInt();
			}
		}
		if( x!= b )
		{
			System.out.println("Error");
		}
		else
		{
			for(int i = 0 ; i < x ; i++)
			{
				for(int j = 0; j< b; j++)
				{
					for(int k = 0 ; k < x; k++)
					{
						arr[i][j] +=arr1[k][i] * arr2[j][k];
					}
				}
			}
			for(int i = 0 ; i < x ; i++)
			{
				for(int j = 0 ; j < b ; j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}
}
