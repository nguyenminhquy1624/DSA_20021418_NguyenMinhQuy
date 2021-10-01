import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		if( a==0 )
		{
			if( b==0 && c!=0 )
			{
				System.out.println("Vô nghiệm");
			}
			else if( b==0 && c==0 )
			{
				System.out.println("Vô số nghiệm");
			}
			else
			{
				System.out.println("Nghiệm duy nhất x = " + ( -c/b ));
			}
		}
		else
		{
			double delta = b*b - 4*a*c;
			if( delta < 0 )
			{
				System.out.println("Vô nghiệm");
			}
			else if( delta == 0 )
			{
				System.out.println("Nghiệm kép x = "+ (-b/(2*a)));
			}
			else
			{
				double x1 = (-b + Math.sqrt(delta))/(2*a);
				double x2 = (-b - Math.sqrt(delta))/(2*a);
				System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + " và x2 = " + x2);
			}
		}
	}
}