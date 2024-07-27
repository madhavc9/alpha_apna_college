/*
1) code for creating a single node  
2) creating head and tail of linkedlist 
3) addFirst operation 
4) addLast operation 
*/

package lectures;

public class L_24_1 {

// from line 6 to 15 .. code for creating a single node in linkedlist
	public static class Node {
		int data;
		Node next;
		//making constructor
		public Node(int data) {
			this.data =data;
			this.next =null;	
		}
	}
	
// creating head and tail 
	public static Node head;
	public static Node tail;
	
// creating static int size 
	public static int size;
	
// inside methods of node class we will define other operations 
	
// line 22 to 32 addFirst Operation we are performing 
	public void addFirst(int data) {
		// create new node 
		Node newNode = new Node(data);
		size++;
		// if linked list is empty then , 
		if(head==null) {
			head=tail=newNode;
			return;
		}
		// newNode next = head
		newNode.next=head;
		// new node next = head  
		head=newNode;
	}
	
// line 38 to 53 addLast Operation we are performing 
	public void addLast(int data) {
		//create new node
		Node newNode =new Node(data);
		size++;
		// if linked list is empty then , 
		if(head==null) {
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		// new node next = tail 
		tail=newNode;	
	}

//method inside L_19_1 class to print our L_19_1
	public void print() {
		if (head==null) {
			System.out.println("Linkedlist is empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	
	public void add(int ind, int data) {
		if (ind==0) {
			addFirst(data);
			return;
		}
		//create new node
		else {
				Node newNode =new Node(data);
				size++;
				Node temp=head;
				int i=0;
				while (i<ind-1) {
					temp=temp.next;
					i++;
				}
				newNode.next=temp.next;
				temp.next=newNode;
	}
	}
	
	public int removefirst() {
		if(size==0) {
			System.out.print("Linkedlist is empty");
			return Integer.MIN_VALUE;
		}
		else if (size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		
		else {
			int val=head.data;
			head=head.next;
			size--;
			return val;	
		}	
	}
	
	
	public int removelast() {
		if (size==0) {
			System.out.println("The linkedlist is empty");
			return Integer.MAX_VALUE;
		}
		else if (size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		else {
			// this part have logic 
			// making a new node with help of which we can rreach till last second
			// as hum apne head node ko disturb nahi krenge
			Node prev=head;
			// iterate using for loop to reach till second last node	
			for ( int i=0;i<size-2;i++) {
				prev=prev.next;
			}
			int val=prev.next.data;
			prev.next=null;
			tail=prev;
			size--;
			return val;
	}
}
	
	public int itrsearch(int key) {
		Node temp=head;
		int idx=0;
		while (temp!=null) {
			if(temp.data==key) {
				return idx;
			}
			else {
				temp=temp.next;
				idx++;
			}
		}
		return -1;
	}
	
	public static int helper(Node head,int key) {
		if (head==null) {
			return -1;
		}
		if(head.data==key) {
			return 0;
		}
		int idx = helper(head.next,key);
		if (idx==-1) {
			return -1;
		}
		return idx+1;
	}
	public static int recsearch(int key) {
		return helper(head,key);
	}
	
	public void reverse() {
		// 3 variable define krenge hum 
		Node prev=null;
		Node curr = tail = head;
		Node next;
		while ( curr !=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	public void deleteNthfromEnd(int n) {
		//calculation of size 
		int sz=0;
		Node temp =head;
		while(temp!=null) {
			temp=temp.next;
			sz++;
		}
		if (n==sz) {
			head=head.next;
		}
		else {
			int i=1;
			int k=size-n;
			Node prev=head;
			while(i<k) {
				prev=prev.next;
				i++;
			}
			prev.next=prev.next.next;
			return;
		}
	}
	
	// finding mid with help of slow fast method 
	public Node findMid(Node head) {
		Node slow = head;
		Node fast = head;
		
		while (fast!= null && fast.next!= null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public boolean checkPalindrome() {
		if (head==null || head.next==null) {
			return true;
		}
		Node midNode = findMid(head);
		
		// reversing the second half 
		
		Node prev = null;
		Node curr =midNode;
		Node next;
		while (curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		Node right =prev;
		Node left = head;
		
		// check left half and right half 
		
		while (right!=null) {
			if(left.data != right.data) {
				return false;
			}
			left=left.next;
			right=right.next;
		}
		return true ;
	}
	
	
	// 255 to 267 for finding the loop inside the linkedlist 
	
	public static boolean isCycle() {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if (slow == fast)
			{
				return true; // cycle exists
			}
			}
		return false; // does not exists
	}
	
	public static void removecycle() {
		//detect cycle ek alag se hi bna dete reason ki iscycle mae slow and fast ko change kr de rha hai na 
		Node slow = head;
		Node fast = head;
		boolean cycle = false;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if (slow == fast)
			{
				cycle = true;// cycle exists
				break;
			}
			}
		if ( cycle == false ) {
			return;
	}
		
		// finding meeting point 
		 slow = head ;
		 Node prev = null;
		 while ( slow!=fast) {
			 slow = slow.next;
			 prev = fast ;
			 fast = fast.next;
		 }
		// remove 
		 prev.next=null;
	}
	
	
	//public Node 
	
	public static void main(String[] args) {
		//
		L_24_1 ll= new L_24_1();
		// here L_19_1 we can assume as a linkedlist 
		
		/*
		ll.addFirst(1);
		ll.addFirst(2);
		ll.print();
		ll.addLast(3);
		ll.addLast(4);
		ll.print();
		ll.add(4, 5);
		ll.print();
		ll.removefirst();
		ll.print();
		ll.removelast();
		ll.print();
		System.out.println(ll.size);
		System.out.println(ll.recsearch(3));
		System.out.println(ll.recsearch(4));
		System.out.println(ll.recsearch(5));
		ll.print();
		ll.reverse();
		ll.print();
		ll.deleteNthfromEnd(2);
		ll.print();
		ll.addLast(1);
		//ll.addLast(4);
		ll.print();
		boolean y = ll.checkPalindrome();
		System.out.println(y);
		ll.print();
		ll.print();	
		*/
		
		head = new Node(1);
		Node temp = new Node (2);
		head.next=temp;
		head.next.next=new Node(4);
		head.next.next.next=temp;
		boolean x = ll.isCycle();
		System.out.println(x);
		ll.removecycle();
		boolean y = ll.isCycle();
		System.out.print(y);
		
	}
}
