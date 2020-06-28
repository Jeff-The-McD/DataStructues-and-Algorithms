/**/
import java.io.*;

public class LinkedList 
{
	// start with initalizing the head for the list
	private Node head;
	private int number_of_entries;
	
	 // constructor starts with null head 
	// and min value as the head data default.
	 LinkedList()
	 {
		 head = new Node(Integer.MAX_VALUE);
		 head.next = null;
	 }
	 
	 
	 // obj: adds a new node to the end of the list
	 // args:takes the data and creates a new node
	 // return value:returns nothing 
	 // time complexity: O(n) has to traverse the end of the list at the worse case
	 public void append(int data)
	 {
		if(data>Integer.MAX_VALUE || data<Integer.MIN_VALUE) {return;}
		
		Node new_node = new Node(data);
		
		Node tracker  = head;
		
		while(tracker.next != null)
		{
			tracker = tracker.next;
		}
		
		tracker.next = new_node;
		number_of_entries++;
	 }
	 
	 // obj: adds a new node at the head of the list
	 // args : takes the data and creates a new node to add
	 // return value : void
	 // time complexity : O(1) as the head is constant reference
	 public  void addAtHead(int data)
	 {
		 
		 if(data>Integer.MAX_VALUE || data<Integer.MIN_VALUE) {return;}
		 
		 Node new_node = new Node(data);
		 
			 
			 
		 new_node.next = head;
			 
		 head = new_node;
		 number_of_entries++;
	 }
	 
	 public void insertAt(int data, int index)
	 {
		 
		 
	 }
	 
	 public void printList()
	 {
		 Node tracker = head;
		 
		 while(tracker != null)
		 {
			 System.out.print(tracker.data+"-->");
			 tracker = tracker.next;
		 }
		 System.out.print("NULL");
		 System.out.println();
	 }
	 
	 public int getEntries() {return number_of_entries;}
	
	
	static class Node
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
