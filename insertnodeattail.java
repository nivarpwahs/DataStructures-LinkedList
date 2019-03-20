package linkedlist;

public class insertnodeattail {
	
	 Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		
		Node(int d)
		{
			data=d;
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Node head = new Node(1);
		Node second = new Node(2);
		head.next = second;
		second.next = null;
		
		Node cuNode = head;
		
		while(cuNode.next!=null)
		{
			cuNode = cuNode.next;
		}
		
		
			Node tail = new Node(3);
			cuNode.next = tail;
			tail.next = null;
		
		
		System.out.println(second.next.data);
		
	}

}
