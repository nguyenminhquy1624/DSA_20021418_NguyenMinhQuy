import java.util.Random;
import java.util.Scanner;

public class Bai_19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		Random rand = new Random();
		int num = rand.nextInt(b-a+1)+a;
		System.out.println(num);
	}
}
