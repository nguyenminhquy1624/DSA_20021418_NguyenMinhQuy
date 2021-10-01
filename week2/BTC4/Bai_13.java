import java.util.Random;
import java.util.Scanner;

public class Bai_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [][] a = new int[n][n];
		Random rand = new Random();
		for(int i =0 ; i < n; i++)
		{
			for(int j =0 ; j<n; j++)
			{
				a[i][j] = rand.nextInt(9)+1;
			}
		}
		for(int i =0 ; i < n; i++)
		{
			for(int j =0 ; j<n; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for(int i =0 ; i < n; i++)
		{
			for(int j =i+1 ; j<n; j++)
			{
				int temp = a[i][j] ;
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		System.out.println();
		for(int i=0 ; i < n; i++)
		{
			for(int j =0 ; j<n; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
