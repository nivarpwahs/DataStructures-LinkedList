package linkedlist;

public class deleteakey {
	
	Node head;
	
	class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next =  null;
		}
	}
	
	void push(int data)
	{
		Node new_node= new Node(data);
		new_node.next=head;
		head=new_node;
	}
	
	void deletekey(int key)
	{
		Node curr_node = head;
		Node prev_node=null;
		
		while(curr_node.data!=key)
		{
			prev_node=curr_node;
			curr_node=curr_node.next;
		}
		
		prev_node.next=curr_node.next;
		
	}
	
	public static void main(String[] args) {
		deleteakey list=new deleteakey();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		
		list.deletekey(3);
		System.out.println(list.head.data);
	}

}
