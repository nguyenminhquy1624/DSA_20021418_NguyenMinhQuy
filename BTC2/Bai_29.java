import java.util.Scanner;

public class Bai_29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int m = scanner.nextInt();
		int y = scanner.nextInt();
		
		int y0 = y -((14-m)/12);
		int x = y0 + (y0/4) - (y0/100) +(y0/400);
		int m0 = m + 12*((14-m)/12) - 2;
		int d0 = (d+x+(31*m0)/12)%7;
		switch( d0 )
		{
		case 0 :
		{
			System.out.println("Chủ Nhật");
			break;
		}
		case 1 :
		{
			System.out.println("Thứ Hai");
			break;
		}
		case 2 :
		{
			System.out.println("Thứ Ba");
			break;
		}
		case 3 :
		{
			System.out.println("Thứ Tư");
			break;
		}
		case 4 :
		{
			System.out.println("Thứ Năm");
			break;
		}
		case 5 :
		{
			System.out.println("Thứ Sáu");
			break;
		}
		case 6 :
		{
			System.out.println("Thứ Bảy");
			break;
		}
		}
	}

}
