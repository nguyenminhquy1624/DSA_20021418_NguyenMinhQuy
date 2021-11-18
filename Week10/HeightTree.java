
class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class HeightTree {
	public static int height(Node root) {
	    int hi = -1;
	          if(root == null) return hi;
	          return 1+ Math.max(height(root.left), height(root.right));
	    }
	
	public static void main(String[] args) {

	}

}
