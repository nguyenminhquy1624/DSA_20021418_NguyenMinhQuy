import java.util.ArrayList;
import java.util.Scanner;

public class Bai_34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i =0 ; i < 3 ; i++)
		{
			arr.add(scanner.nextInt());
		}
		arr.sort(null);
		for(int i = 0 ; i<arr.size();i++)
		{
			System.out.print(arr.get(i)+ " ");
		}
	}

}
