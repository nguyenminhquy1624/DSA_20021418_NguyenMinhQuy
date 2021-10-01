import java.util.ArrayList;
import java.util.List;

public class Bai6_NewYearChao {

	public static void minimumBribes(List<Integer> q) {
		int a[] = new int[q.size()];
		int count = 0;
		for(int i =0 ; i < a.length; i++)
		{
			a[i] = q.get(i);
		}
		for(int i = a.length-1; i >=0;i--)
		{
			if( a[i] != (i+1) )
			{
				if((i-1)>=0 && a[i-1] == (i+1))
				{
					int temp = a[i-1];
					a[i-1] = a[i];
					a[i] = temp;
					count++;
				}
				else if((i-2)>=0 && a[i-2] == (i+1))
				{
					int temp = a[i-2];
					a[i-2] = a[i-1];
					a[i-1] = a[i];
					a[i] = temp;
					count +=2;
				}
				else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		System.out.println(count);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> q = new ArrayList<Integer>();
		q.add(2);
		q.add(1);
		q.add(5);
		q.add(3);
		q.add(4);
		minimumBribes(q);
	}

}
