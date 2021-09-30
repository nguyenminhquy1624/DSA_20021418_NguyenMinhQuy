import java.util.Random;
import java.util.Scanner;

public class Bai_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int N = scanner.nextInt();
		for(int i =0 ; i < N ; i++)
		{
			for(int j = 0 ; j < 5 ; j++)
			{
				System.out.print( (rand.nextInt(13)+1) +" ");
			}
			System.out.println();
		}
	}

}
