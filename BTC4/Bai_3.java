import java.util.Random;
import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int n = rand.nextInt(9)+1;
		int [] a = new int[n];
		int [] b = new int[n];
		
		for(int i =0 ; i < n; i++)
		{
			a[i] = rand.nextInt(9)+1;
			b[i] = rand.nextInt(9)+1;
		}
		double sum = 0;
		for(int i = 0; i< n; i++)
		{
			sum += Math.pow(a[i]-b[i], 2);
		}
		System.out.println(Math.sqrt(sum));
	}

}
