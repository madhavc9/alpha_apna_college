// TOP VIEW OF A TREE

package lecture;

import java.util.*;
  
public class L_30_3 {

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
	
	static class Info {
		Node node;
		int hd;
		
		public Info(Node node,int hd) {
			this.node=node;
			this.hd=hd;
		}
	}
	
	public static void topView(Node root) {
		// for level order traversal creation of queue 
		Queue<Info> q=new LinkedList<>();
		HashMap<Integer,Node> map = new HashMap<>();
		int min=0,max=0; 
		q.add(new Info(root,0));
		q.add(null);// this extra thing null node to track level wise traversal 
		while(!q.isEmpty()) {
			Info curr=q.remove();
			// if current = null , then it means that level khatm hua hai ya saare nodes traversed ho gaye 
			if(curr==null) {
				if(q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			}
				else {
					if(!map.containsKey(curr.hd)) { // first time hd is occuring 
						map.put(curr.hd,curr.node);
					}
					if(curr.node.left!=null) {
						q.add(new Info(curr.node.left,curr.hd-1));
						min=Math.min(min,curr.hd-1);
					}
					if(curr.node.right!=null) {
						q.add(new Info(curr.node.right,curr.hd+1));
						max=Math.max(max,curr.hd+1);
					}
				}
			} 
			
		
		for(int i=min;i<=max;i++) {
			System.out.print(map.get(i)+" ");
		}
		System.out.println();
		
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
			topView(root);

	}

}
