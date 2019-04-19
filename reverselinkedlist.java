package linkedlist;

public class reverselinkedlist {
	
	
	Node head;
	
	public class Node{
		
		int data;
		Node next;
		
		Node(int d)
		{
			this.data=d;
			next=null;
			
		}
	}
		
		
		public void push(int data)
		{
			Node curr_node = new Node(data);
			curr_node.next=head;
			head = curr_node;
		}
		
		public void display()
		{
			Node curr_node = head;
			while(curr_node !=null)
			{
				System.out.println(curr_node.data);
				curr_node=curr_node.next;
			}
			
		}
		
		
		public void reverse()
		{
			Node curr_node=head ;
			Node prev_node=head ;
			Node next=null;
			
			while(curr_node!=null)
			{
				next = curr_node.next;
				 curr_node.next = prev_node;
				prev_node = curr_node;
				curr_node=next;
			}
			
			head = prev_node;
			
			System.out.println(head.data);
			System.out.println(head.next.data);
			
		}
	
	public static void main(String[] args) {
		
		reverselinkedlist rl = new reverselinkedlist();
		rl.push(4);
		rl.push(1);
		rl.push(3);
		rl.push(2);
		rl.display();
		rl.reverse();
		
	}

}
