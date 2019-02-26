package Trees;
class PNode{
	PNode left;
	PNode right;
	int data;
	PNode next;
	
	public PNode(int data){
		this.left=null;
		this .right=null;
		this.next=null;
		this.data=data;
	}
}

public class NextRightPointers {
	PNode root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextRightPointers tree=new NextRightPointers();
		tree.root = new PNode(4);
        tree.root.left = new PNode(2);
        tree.root.right = new PNode(5);
        tree.root.left.left = new PNode(1);
        tree.root.left.right = new PNode(3);
        tree.root.right.right=new PNode(7);
        tree.root.right.left=new PNode(6);
        int height=  findheight(tree.root);
        for(int i=1;i<=height;i++){
        	PNode prev=null;
        	FindNextRightPointers(tree.root,i, prev);	
        }      
        display(tree.root);
	}
	private static void display(PNode root) {
		// TODO Auto-generated method stub
		if(root!=null){
     		System.out.println(root.data);
     		if(root.next!=null){
     			System.out.print(root.next.data);
     		}
     		else{
     			System.out.print("null");
     		}		
     		display(root.left);
     		display(root.right);
     	}
     	}	
	private static void FindNextRightPointers(PNode root, int level, PNode prev) {
		// TODO Auto-generated method stub
			PNode pre=root;
			PNode curr=null;
			while(pre.left!=null){
				curr=pre;
				while(curr!=null){
					curr.left.next=curr.right;
					if(curr.next!=null)
					curr.right.next=curr.next.left;					
					curr=curr.next;
				}
				pre=pre.left;
			}
	}
	private static int findheight(PNode root2) {
		// TODO Auto-generated method stub
		if(root2==null)
		return 0;
		else{
			return 1+Math.max(findheight(root2.left), findheight(root2.right))+1;
		}	
	}

}
