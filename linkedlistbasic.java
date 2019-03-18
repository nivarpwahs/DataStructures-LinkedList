package linkedlist;

public class linkedlistbasic {
	
	static Node head;
	static Node tail ;
	
	static class Node{
		
		int data;
		Node next;
		Node t=head;
		
		
		
		Node(int d)
		{
			data=d;
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Node head = new Node(5);
		Node second = new Node(6);
		Node third = new Node(7);
		head.next = second;
		second.next = third;
		third.next = null;
		//System.out.println(head.next.data);
		tail = head;
		while(tail != null)
		{
			System.out.println(tail.data);
			tail = tail.next;
		}
		
		
		
		
	}

}
