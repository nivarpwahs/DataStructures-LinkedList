package linkedlist;

public class deleteanodeatposition {
	
	
	Node head;
	class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			 next = null;
		}
	}
	
	public void push(int data)
	{
		Node new_node = new Node(data);
		 
		new_node.next = head;
		 head= new_node;
		
		
	}
	
	
	public void deleteat(int position)
	{
		int count =0;
		if(head==null)
		{
			return;
		}
		
		if(position==0)
		{
			head=head.next;
			return;
		}
		
		
		Node curr_node = head;
		Node prev_node = null;
		
		while(count < position)
		{
			prev_node = curr_node;
			curr_node= curr_node.next;
			count++;
			
			
		}
		
		prev_node.next = curr_node.next;
	}
	
	
	public static void main(String[] args) {
		
		deleteanodeatposition lllist = new deleteanodeatposition();
		lllist.push(1);
		lllist.push(2);
		lllist.push(3);
		lllist.push(4);
		lllist.push(5);
		System.out.println(lllist.head.next.data);
		lllist.deleteat(2);
		System.out.println(lllist.head.next.next.data);
		
		
		
		
		
		
		
	}

}
