package Trees;

public class BinaryTreetoLinkedList {
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
	private static Node prev=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree=new BST();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.right = new Node(6);   
        
       // flattenBinaryTree(tree.root); //O(nlogn)
        flattenBinaryTreeOn(tree.root);
		display(tree.root);
        
	}

private static void display(Node root) {
		// TODO Auto-generated method stub
	     	if(root!=null){
	     		System.out.println(root.data);
	     		//display(root.left);
	     		display(root.right);
	     	}	
	}

private static void flattenBinaryTreeOn( Node root) {
		// TODO Auto-generated method stub
	if(root==null) return;
	flattenBinaryTreeOn(root.right);
	flattenBinaryTreeOn(root.left);
	root.right=prev;
	root.left=null;
	prev=root;
	}

private static void flattenBinaryTree(Node root) {
	// TODO Auto-generated method stub		
	if(root==null)return;
		Node left=root.left;
		Node right=root.right;
		root.left=null;
		//System.out.println(root.data);
		flattenBinaryTree(root.left);
		flattenBinaryTree(root.right);
		root.right=left;
		Node curr=root;
		while(curr.right!=null)
			curr=curr.right;
		curr.right=right;		
	}
}
	
