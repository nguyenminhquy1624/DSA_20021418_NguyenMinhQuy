import java.util.Random;

public class Bai_30 {

	public static void main(String[] args) {
		double [] arr = new double[5];
		Random rand = new Random();
		for(int i = 0 ; i<5 ; i++ )
		{
			arr[i] = rand.nextDouble();
		}
		double sum = 0;
		double max = arr[0];
		double min = arr[0];
		for( double i:arr )
		{
			sum+= i;
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		System.out.println(sum/5);
		System.out.println(max);
		System.out.println(min);
	}

}
