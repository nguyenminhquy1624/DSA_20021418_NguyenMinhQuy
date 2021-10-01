import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		double x = scanner.nextDouble();
		
		if( (Math.pow(Math.sin(x),2) + Math.pow(Math.cos(x), 2) ) == 1)
		{
				System.out.println("Hang dang thuc dung");
		}
		else
		{
			System.out.println("Hang dang thuc bi sai");
		}

	}

}
