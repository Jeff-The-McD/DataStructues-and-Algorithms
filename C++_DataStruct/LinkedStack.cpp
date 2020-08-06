#include<exception>
#include<iostream>

struct Node {
	int data;
	Node* next;
};

class LinkedStack {


private:
	Node* head;
	int num_of_entries;

public:
	/*constructs stack*/ 
	LinkedStack()
	{
		head = NULL;
	}

	/*Test whether container is empty*/
	bool isEmpty()
	{
		return(head == NULL);
	}

	/*Return size*/
	int size()
	{
		return num_of_entries;
	}

	/*Access head element */
	int peek()
	{
		return head->data;
	}

	/*Insert element*/
	void push(int data)
	{
		/*1.creates new node to add*/
		Node* temp = new Node;


		/*2.assigns new data to the temp node*/
		temp->data = data;

		/*3.assigns the next to the current head*/
		temp->next = head;

		/*4.the head is now the new temp node*/
		head = temp;

		// increment count 
		num_of_entries++;
	}


	/* Remove top element */
	int pop()
	{
		//assign data of the head to a local variable
		int data = head->data;

		// 1. assign the head to the the next item in the stack
		head = head->next;

		// 2. decrement count
		num_of_entries--;

		//3. return the former heads data
		return data;
	}

	void printStack()
	{
		Node* temp = head;
		std::cout << "There are " << num_of_entries << " items in the stack" << std::endl;
		while (temp != NULL)
		{
			std::cout << temp->data << std::endl;
			temp = temp->next;
		}

	}
};

int main()
{
	LinkedStack l_stack;
	l_stack.push(1);
	l_stack.push(2);
	l_stack.push(3);
	l_stack.printStack();
	l_stack.pop();
	l_stack.printStack();
	l_stack.pop();
	l_stack.pop();

	if (l_stack.isEmpty())
		std::cout << "The stack is empty";
}