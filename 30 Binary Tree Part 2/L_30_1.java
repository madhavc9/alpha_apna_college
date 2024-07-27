// DIAMETER OF A TREE
// APPROACH 1 
// APPROACH 2


package lecture;

	public class L_30_1 {
	
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
	
		public static int height(Node root) {
			if(root==null) {
				return 0;
			}
			int lh=height(root.left);
			int rh=height(root.right);
			return Math.max(lh,rh)+1;
		}
		
		public static int diameter1(Node root) {
			// Base Case
			if(root==null) {
				return 0;
			}
			int ldiam=diameter1(root.left);
			int rdiam=diameter1(root.right);
			int lh=height(root.left);
			int rh=height(root.right);
			int selfdiam=(lh+rh+1);
			int x= Math.max(rdiam,ldiam);
			return Math.max(x,selfdiam);
		}
		
		// making up of static class Info
			static class Info{
				int diam;
				int ht;
				// constructor making 
				public Info(int diam,int ht) {
					this.diam=diam;
					this.ht=ht;
				}	
			}
			
		public static Info diameter2(Node root) {
			if(root==null) {
				return new Info(0,0);
			}
			Info leftInfo=diameter2(root.left);
			Info rightInfo=diameter2(root.right);
			int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
			int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
			return new Info(diam,ht);
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
			root.left=new Node(2);
			root.right=new Node(3);
			root.left.left=new Node(4);
			root.left.right=new Node(5);
			root.right.left=new Node(6);
			root.right.right=new Node(7);
			System.out.println(" Diameter of tree : " +diameter1(root));
			System.out.println(" Diameter of tree : " +(diameter2(root).diam));

	}

}
