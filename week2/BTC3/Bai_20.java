import java.util.Scanner;

public class Bai_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s ="";
		while( n>0 )
		{
			int k =n%2;
			s = k+s;
			n/=2;
		}
		System.out.println(s);
	}

}
