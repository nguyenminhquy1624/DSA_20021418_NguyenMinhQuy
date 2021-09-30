import edu.princeton.cs.algs4.*;

public class Bai_2 {

	public static void main(String[] args) {
		In in = new In("C:/Users/MINH QUY/Documents/JAVA_ECLIPSE/Data_Structures_Algorithms/algs4-data/algs4-data/tinyUF.txt"); 
	      int[] a = in.readAllInts();
	      StdArrayIO.print(a);
	      int N = a[0];
	      UF uf = new UF(N);
	      int i=1;
	      int count =0;
	      while( i < a.length )
	      {
	    	  int p = a[i]; i++;
	    	  int q = a[i] ; i++;
	    	  boolean kq = true;
	    	  if (!uf.connected(p, q)) 
	    	  { 
		            uf.union(p, q);
		            count++;   
		       }
	    	  for(int k = 0 ; k < N-1 ; k++)
	            {
	            	if( !uf.connected(k, k+1) )
	            		kq = false;
	            }
	    	  if( kq == true )
	    	  {
	    		  System.out.println(count);
	    	  }
	      }
	      System.out.println("FAILED");
	}
}
