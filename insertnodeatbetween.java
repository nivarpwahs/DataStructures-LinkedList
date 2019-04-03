package linkedlist;

public class insertnodeatbetween {
	 
	
	
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
		}
		
	}
	
	insertnodeatbetween(Node head,int data, int position)
	{
		
		int count = 1;
		Node newnode = new Node(data);
		Node curr_node = head;
		while(count < position-1)
		{
			curr_node = curr_node.next;
			count++;
			
		}
		newnode.next = curr_node.next;
		curr_node.next = newnode;
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(4);
		
		third.next = null;
		second.next = third;
		head.next = second;
		
		
		
		insertnodeatbetween abc = new insertnodeatbetween(head ,3, 3);
		
		System.out.println(head.next.next.data);
		
		
		
		
	}

}
