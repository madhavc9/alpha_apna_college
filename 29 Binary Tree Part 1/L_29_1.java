// Build Tree when Preorder traversal nodes given
// nodes given preorder traversal
// nodes given inorder traversal
// nodes given postorder traversal
// nodes given levelorder traversal

package lecture;
import java.util.*;
public class L_29_1 {
	
	// static class Nodes with constructor also there 
	static class Node{
		int data;
		Node left;
		Node right;
		
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	}
	
	// class Binary tree with method buildTree 
	static class BinaryTree{
		static int idx=-1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			return newNode;
		}

	
	// preorder traversal
	public static void preorder(Node root) {
		if(root==null) {
			//System.out.print("-1"+" ");
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}

	// inorder traversal
		public static void inorder(Node root) {
			if(root==null) {
				//System.out.print("-1"+" ");
				return;
			}
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
	// postorder traversal
		public static void postorder(Node root) {
			if(root==null) {
				//System.out.print("-1"+" ");
				return;
			}
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	// level order traversal
		public static void levelOrder(Node root) {
			if(root==null) {
				return;
			}
			Queue<Node> q = new LinkedList<> ();  
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node currNode=q.remove();
				if(currNode==null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					} else {
						q.add(null);
					}
				} else {
					System.out.print(currNode.data+" ");
					if(currNode.left!=null) {
						q.add(currNode.left);
					}
					if(currNode.right!=null) {
						q.add(currNode.right);
					}
				}
			}
		}
}
	
	// main function
	public static void main(String[] args) {
		// use of array to store the nodes of tree
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);
		System.out.print(root.data);
		System.out.println();
		System.out.println();
		System.out.print("Preorder Traversal :" );
		tree.preorder(root);
		System.out.println();
		System.out.println();
		System.out.print("Inorder Traversal :" );
		tree.inorder(root);
		System.out.println();
		System.out.println();
		System.out.print("Postorder Traversal :" );
		tree.postorder(root);
		System.out.println();
		System.out.println();
		System.out.print("Levelorder Traversal :" );
		tree.levelOrder(root);
	}
}
