import java.util.Scanner;

public class Bai_16 {

	public static void main(String[] args) {
		// Sai do chương trình nó sẽ thực hiện các phép tính từ trái sang phải theo thứ tự
		// Cần phải sửa theo đoạn chương trình tinh sau đây
		final double G = Math.pow(6.67, -11);
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int r = sc.nextInt();
		double F = (G*m1*m1)/(r*r);
		System.out.println(F);
	}

}
