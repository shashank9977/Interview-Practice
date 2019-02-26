package Trees;

public class Sumroottoleaf {

	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Sumroottoleaf tree=new Sumroottoleaf();
		tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
	}

}
