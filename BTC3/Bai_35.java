import java.util.Scanner;

public class Bai_35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean [] check = new boolean[n];
		for(int i=2 ; i<n; i++)
		{
			check[i] = true;
		}
		for(int i=2;i<n;i++)
		{
			if( check[i] == true )
			{
				System.out.print(i+" ");
			}
			for(int j=i*2;j<n;j+=i)
			{
				check[j] = false;
			}
		}
	}

}
