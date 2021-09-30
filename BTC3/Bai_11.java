
public class Bai_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 16;
		while( n < 2048 )
		{
			System.out.print(n +"\t");
			System.out.print(Math.log(n)+"\t");
			System.out.print(n*(Math.log(n))+"\t");
			System.out.print(Math.pow(n, 2) +"\t");
			System.out.print(Math.pow(n, 3) +"\t");
			//System.out.print(Math.pow(2, n) );
			System.out.println();
			n*=2;
		}
	}

}
