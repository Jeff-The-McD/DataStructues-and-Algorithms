
public class LinkedStack 
{
	Node head;
	int number_of_entries;
	
	
	public LinkedStack()
	{
		head = null;
		number_of_entries = 0;
	}
	
	public void push(int data)
	{
		if(head == null)
		{
			head = new Node(data);
			number_of_entries++;
		}
		
		else
		{
			Node new_node = new Node(data);
			
			new_node.next = head;
			
			head = new_node;
			
			number_of_entries++;
		}
		
	}
	
	public int pop()
	{
		if(head == null)
		{
			throw new NullPointerException();
		}
		
		else
		{
			int value_to_return = head.data;
			head = head.next;
			number_of_entries--;
			return value_to_return; 
		}
		
	}
	
	public int peek()
	{
		return head.data;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void clear()
	{
		head = null;
		number_of_entries=0;
	}
	
	public int size()
	{
		return number_of_entries;
	}
	
	public void printStack()
	{
		Node tracker = head;
		
		while(tracker != null)
		{
			System.out.print(tracker.data+"-->");
			tracker=tracker.next;
		}
		System.out.println("Null");
		
	}
	
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

}
