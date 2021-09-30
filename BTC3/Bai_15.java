
public class Bai_15 {

	public static void main(String[] args) {
		// hàm d cho ra kết quả của PI
		int N = 1000000;
		double sum = 0;
		for (int i = 1; i <= N; i++)
			sum = sum + 1 / (1.0 * i * i);
		System.out.println(sum);
		
	}

}
