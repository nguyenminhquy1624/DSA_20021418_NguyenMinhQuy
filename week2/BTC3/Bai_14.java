import java.util.Scanner;

public class Bai_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long P = scanner.nextInt();
		int r = scanner.nextInt();
		int t = scanner.nextInt();
		
		double r_ = 1.0*r/1200;
		int N = t*12;
		
		double c = (r_*P)/( 1 - (Math.pow(1+r_,-N)));
		System.out.println(c);
		System.out.println(c*N); // tổng tiền phải trả
		// số tiền còn lại phải thanh toán 
		for(int i = 0 ; i < N; i++)
		{
			System.out.println("Tháng " +(i+1) + " "+ ((c*N)-c*i));
		}
	}

}
