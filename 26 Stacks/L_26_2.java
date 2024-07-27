// stack using LINKEDLIST

package lecture;
import java.util.*;
public class L_26_2 {
	
	// creating a node 
	static class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null; 
	}
	
	static class Stack {
		static Node head = null;
		
		// isEmpty Function 
		public static boolean isEmpty() {
			return head==null;
		}
		
		//push
		public static void push(int data) {
			 // head ko replace krna 
			Node newNode=new Node(data);
			if(isEmpty()) {
				head=newNode;
				return; 
			}
			newNode.next=head;
			head=newNode;	
		}
		
		//pop
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = head.data;
			head=head.next;
			return top;
		}
		//peak
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;	
	}
		
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}

	}
	}
}
} 
