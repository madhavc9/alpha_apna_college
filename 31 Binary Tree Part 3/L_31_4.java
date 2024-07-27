// Kth Ancestor of a Node 

package lecture;


public class L_31_4 {

	// making up of static class node 
	static class Node{
		int data;
		Node left;
		Node right;
		// constructor making 
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	//kAncestor function
	public static int kAncestor(Node root,int n , int k) {
		if(root==null) {
			return -1;
		}
		if(root.data==n) {
			return 0;
		}
		int leftDist=kAncestor(root.left,n,k);
		int rightDist=kAncestor(root.right,n,k);
		if(leftDist==-1&&rightDist==-1) {
			return -1;
		}
		int max=Math.max(leftDist, rightDist);
		if(max+1==k) {
			System.out.println(root.data);
		}
		return max+1;
	}
	
	public static void main(String[] args) {
				/*
			      1
				/   \
			   2      3
			 /   \  /   \
			4    5  6    7
		*/
		Node root=new Node(1);
		root.left=  new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		int n1=6,k=1;
		kAncestor(root,n1,k);

	}
}
