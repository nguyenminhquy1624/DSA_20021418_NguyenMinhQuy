
//class Node {
//    Node left;
//    Node right;
//    int data;
//    
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}

public class Insertiontree {

	public static Node insert(Node root, int data) {
		if (root == null) {

			root = new Node(data);
			return root;
		}

		else if (root.data >= data) {

			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
