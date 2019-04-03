package linkedlist;

public class insertnodeathead {
	
	
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data =d;
		}
	}
	
	
	public static void main(String[] args) {
		Node head = new Node(5);
		Node second = new Node(6);
		second.next =  null;
		head.next = second;
		
		
		Node newnode = new Node(4);
		newnode.next = head;
		head = newnode;
		
		
		System.out.println(head.next.next.next.data);
		
		
		
		
	}
	

}
