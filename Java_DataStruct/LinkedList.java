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
		 number_of_entries = 0;
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
	 
	// obj: deletes the node at the end 
	// args:none
	// return value:returns nothing 
	// time complexity: O(n) has to traverse the end of the list at the worse case
	 public void deleteEnd()
	 {
		 if(head == null) {return;}
		 		 
		 if(head.next == null) {return;}
		 
		 Node tracker = head;
		 
		 while(tracker.next.next != null)
		 {
			 tracker = tracker.next;
		 }
		 tracker.next = null;
		 number_of_entries--;
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
	 
	 // obj: deletes the head of the node
	 // args: none
	 // return value: void
	 // time complexity : O(1) as the head is constant 
	 public void deleteHead()
	 {
		 Node tracker = head;
		 tracker = tracker.next;
	 }
	 
	 
	// obj: insert at a specific position at the linked list
	// args: data of the none ,  index 
	// return value: void
	// time complexity : O(n) as the head is constant 
	 public void insertAt(int data, int index)
	 {
		 if(index<1) 
		 {
			 System.out.println("Invalid Position");
			 return;
		 } 
		 
		 if(index == 0)
		 {
			 addAtHead(data);
		 }
		 
		 else
		 {
			 Node newNode = new Node(data);
			 Node tracker = head;
			 for(int i = 0;i<index-1;i++)
			 {
				 tracker = tracker.next;
			 }
			 
			 Node nodeBefore = tracker;
			 Node nodeAfter = nodeBefore.next;
			 newNode.next = nodeAfter;
			 nodeBefore.next = newNode;
		 }
	 }
	 
	 
	 
	 // obj: delete at a specific position
	 // args: position to remove the node
	 // return value: void
	 // time complexity: O(n)
	 public void deleteAt(int pos)
	 {
		 Node tracker = head;
		 
		 if(pos == 1)
		 {
			 head = head.next;
		 }
		 
		 else
		 {
			 for(int i = 0;i<pos-1;i++)
			 {
				 tracker = tracker.next;
			 }
			 
			 Node nodeBefore = tracker;
			 Node nodeToRemove = nodeBefore.next;
			 Node nodeAfter = nodeToRemove.next;
			 nodeBefore.next = nodeAfter;
			 nodeToRemove = null;
		 }
	 }
	 
	 //obj: prints the list
	 // args: none
	 // return value : void;
	 // time complexity: (O)n;
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
