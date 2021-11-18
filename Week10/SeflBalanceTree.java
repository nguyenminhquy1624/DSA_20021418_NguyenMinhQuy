
public class SeflBalanceTree {
	static class Node 
	{
		int val;   
		int ht;      
		Node left;   
		Node right;   

	}
	

	public static int heightMax(Node root)
	{
		int maxHeight = -1;
		if(root.left != null)
			maxHeight = Math.max(maxHeight, root.left.ht);
		if(root.right != null)
			maxHeight = Math.max(maxHeight, root.right.ht);
		return maxHeight;
	}

	public static Node insert(Node root, int val)
	{
		if(root == null)
		{
			Node node = new Node();
			node.val = val;
			node.left = node.right = null;
			node.ht = 0;
			return node;
		}
		if(val < root.val)
			root.left = insert(root.left, val);
		else
			root.right = insert(root.right, val);
		int balanceFactor = balanceFactor(root);
		if(balanceFactor < -1)
		{
			if(balanceFactor(root.right) > 0)
			{
				root.right = rotateRight(root.right);
				return rotateLeft(root);
			}
			else
				return rotateLeft(root);
		}
		else
		{
			if(balanceFactor > 1)
			{
				if(balanceFactor(root.left) < 0)
				{
					root.left = rotateLeft(root.left);
					return rotateRight(root);
				}
				else
					return rotateRight(root);
			}
		}
		root.ht = heightMax(root) + 1;
		return root;
	}

	public static Node rotateRight(Node x)
	{
		Node y = x.left;
		x.left = y.right;
		y.right = x;
		// height
		x.ht = heightMax(x)+1;
		y.ht = heightMax(y)+1;
		return y;
	}

	public static Node rotateLeft(Node x)
	{
		Node y = x.right;
		x.right = y.left;
		y.left = x;
		x.ht = heightMax(x)+1;
		y.ht = heightMax(y)+1;
		return y;
	}

	public static int balanceFactor(Node root)
	{
		int left = -1;
		int right = -1;
		if(root.left != null)
			left = root.left.ht;
		if(root.right != null)
			right = root.right.ht;
		return (left - right);
	}
	

	public static void preorder(Node node) 
	{
		if(node == null)
			return;
		System.out.print(node.val+"("+balanceFactor(node)+")  ");
		preorder(node.left);
		preorder(node.right);
	}
	public static void inorder(Node node)
	{
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.val+"("+balanceFactor(node)+")  ");
		inorder(node.right);
	}
	
	public static void main(String[] args) {
		
	}
}
