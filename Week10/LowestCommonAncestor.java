
public class LowestCommonAncestor {

	public static Node lca(Node root, int v1, int v2) {
		if (root == null)
			return null;
		if (v1 > v2) {
			int temp = v2;
			v2 = v1;
			v1 = temp;
		}
		while (root.data < v1 || root.data > v2) {
			if (root.data < v1)
				root = root.right;
			else if (root.data > v2)
				root = root.left;
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
