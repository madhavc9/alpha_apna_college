// Building a Binary Search Tree by inserting the nodes 
// printing using inorder traversal 
// searching in a BST
// DELETE A NODE IN BST 
// print in range
// root to leaf paths
 
package lecture;

import java.util.ArrayList;

public class L_32_1 {

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
	 
	public static Node insert(Node root,int val) {
		if(root==null) {
			root=new Node(val);
			return root;
		}
		if(root.data>val) {
			//left subtree
			root.left=insert(root.left,val);
		}else {
			root.right=insert(root.right,val);
		}
		return root;
		
	}
	
	public static void inorder(Node root) {
		if(root==null) {
			return ;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

	
	public static boolean search(Node root,int key) {
		if(root==null) {
			return false;
		}
		if(root.data>key) {
			return search(root.left,key);
		}
		else {
			return search(root.right,key);
		}
	}

	public static Node delete(Node root,int val) {
		if(root.data<val) {
			root.right=delete(root.right,val);
		} else if(root.data>val) {
			root.left=delete(root.left,val);
		}else {
			// ie root hi hai wo jisko delete krna 
			// case 1 - leaf node
			if(root.left==null && root.right==null) {
				return null;
			}
			// case 2 - single child
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
		}
			// case 3 - both children it have
			// IS - Inorder Successor
			Node IS = findInorderSuccessor(root.right);
			root.data=IS.data;
			root.right=delete(root.right,IS.data);
		}
		return root;
	}
	
	public static Node findInorderSuccessor(Node root) {
		while(root.left !=null) {
			root = root.left;
		}
		return root;
	}
	
	public static void printInRange(Node root,int k1,int k2) {
		if(root==null) {
			return;
		}
		if(root.data>=k1&&root.data<=k2) {
			printInRange(root.left,k1,k2);
			System.out.print(root.data+" ");
			printInRange(root.right,k1,k2);
		}
		else if(root.data<k1){
			printInRange(root.right,k1,k2);
		}
		else {
			printInRange(root.left,k1,k2);
		}
	}
	
	public static void PrintPath(ArrayList<Integer> Path) {
		for(int i=0;i<Path.size();i++) {
			System.out.print(Path.get(i)+"->");
		}
		System.out.println("Null");
	}
	
	public static void printRoot2Leaf(Node root,ArrayList<Integer> Path) {
		if(root==null) {
			return;
		}
		Path.add(root.data);
		if(root.left==null&&root.right==null) {
			PrintPath(Path);
		}
		printRoot2Leaf(root.left,Path);
		printRoot2Leaf(root.right,Path);
		Path.remove(Path.size()-1);
	}
	
	public static boolean isValidBST(Node root, Node min , Node max) {
		if(root==null) {
			return true;
		}
		if(min!=null && root.data<=min.data)
		{
			return false;
		}
		else if(max!=null && root.data>=max.data) {
			return false;
		}
		
		return isValidBST(root.left,min,root)&&
				isValidBST(root.right,root,max);
	}
	
	public static void main(String[] args) {
		int values[]= {8,5,3,1,4,6,10,11,14};
		// Root node initialised with null
		Node root=null;
		// for loop for inserting 
		for(int i=0;i<values.length;i++) {
			root=insert(root,values[i]);
		}
		
		inorder(root);
		System.out.println();
		int key=7;
		if(search(root,key)) { 
			System.out.println(key + " found ");
		}
		else {
			System.out.println(key + " Not Found ");
		}
		
		// delete krna
		/*
		root=delete(root,1);
		inorder(root);
		*/
		printInRange(root,5,11);
		System.out.println();
		System.out.println("--------");
		printRoot2Leaf(root,new ArrayList<>());
		System.out.println("--------");
		// is validBST
		if(isValidBST(root,null,null)) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}
		// mirror Image
	}
}
