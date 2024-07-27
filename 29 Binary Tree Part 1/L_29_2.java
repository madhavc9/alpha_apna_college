// LEVEL OF A TREE 
// number of nodes in a tree
// sum of nodes 
 
package lecture;
import java.util.*;
public class L_29_2 {

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
	
	public static int noofnodes(Node root) {
		if(root==null) {
			return 0;
		}
		int lh=noofnodes(root.left);
		int rh=noofnodes(root.right);
		return (lh+rh+1);
	}
	
	public static int sumofnodes(Node root) {
		if(root==null) {
			return 0;
		}
		int lh=sumofnodes(root.left);
		int rh=sumofnodes(root.right);
		return (lh+rh+root.data);
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
		System.out.println(" Height of tree : " + height(root));
		System.out.println(" Number of Nodes in a tree : " +noofnodes(root));
		System.out.println(" Sum of nodes of the tree : " +sumofnodes(root));
	}

}
