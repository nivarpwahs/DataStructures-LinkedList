package linkedlist;

public class printreverse {
	
	Node head;
	
	class Node
	{
		
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next = null;
		}
	}
	
	void push(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head=new_node;
		
		
	}
	
	void printinreverse()
	{
		printreverse pp = new printreverse();
		Node curr_node = head;
		while(curr_node != null)
		{
			pp.push(curr_node.data);
			curr_node = curr_node.next;
		}
		Node curr_nodenew = head;
		while(curr_nodenew!=null)
		{
			System.out.println(curr_nodenew.data);
			curr_nodenew = curr_nodenew.next;
		}
	}
	
	
	public static void main(String[] args) {
		printreverse ll = new printreverse();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.printinreverse();
	}

}
