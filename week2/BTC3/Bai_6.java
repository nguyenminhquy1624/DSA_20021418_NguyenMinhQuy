
public class Bai_6 {

	public static void main(String[] args) {
		for (int i = 0, j = 0; i < 10; i++) 
			j += i; // j = 45
		for (int i = 0, j = 1; i < 10; i++) 
			j += j; // j = 2^10 = 1024
			
		for (int j = 0; j < 10; j++) 
			j += j; // 14
		for (int i = 0, j = 0; i < 10; i++) 
		{
			j += j++;
			System.out.println(j);
		}
	}

}
