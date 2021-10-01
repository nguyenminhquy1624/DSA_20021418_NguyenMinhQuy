import java.util.Scanner;

public class Bai_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		int n = scanner.nextInt();
		int sum_n=1;
		for(int i = 1; i <= n ; i++ )
		{
			sum_n *= i;
		}
		System.out.println((Math.pow(x, n))/sum_n);
	}

}
