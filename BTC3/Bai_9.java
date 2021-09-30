import java.util.Random;
import java.util.Scanner;

public class Bai_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double [] a = new double[n];
		Random rand = new Random();
		{
			for(int i =0 ; i < n; i++)
			{
				a[i] = Math.random();
			}
		}
		double sum =0;
		for( double i : a)
		{
			System.out.println(i);
			sum +=i;
		}
		System.out.println(sum/n);
	}

}
