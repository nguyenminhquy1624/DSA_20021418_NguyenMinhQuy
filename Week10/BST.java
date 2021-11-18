
public class BST {

	boolean checkBST(Node root) {
        return checkBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBst(Node root, int min, int max){
    	if (root == null) return true;

    	return 
    		min < root.data &&
    		root.data < max &&
    		checkBst(root.left, min, root.data) && 
    		checkBst(root.right, root.data, max);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
