
public class Bai_10 {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		System.out.println(a); // in ra giá trị max là a
		System.out.println(a + 1); // in ra giá trị ảo của a vì vượt quá bộ nhớ dành cho biến kiểu int
		System.out.println(2 - a); // in ra giá trị đúng của biểu thức 
		System.out.println(-2 - a); // in ra 1 giá trị ảo của a do vượt quá giới hạn bộ nhớ cho biến kiểu int
		System.out.println(2 * a); // in ra giá trị sai
		System.out.println(4 * a); // in ra giá trị sai
	}

}
