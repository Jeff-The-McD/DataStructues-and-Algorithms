#include <iostream>

struct Node
{
	int data;
	Node* next;
};


class Linked_List
{
private:
	Node *head, *tail;
public:
	Linked_List()
	{
		head = NULL;
		tail = NULL;
	}

	// adds the new node to the end of the list
	void add_Node(int n)
	{
		/* 1. creates new node */
		Node* temp = new Node;

		/* 2. assigns the data to the node */
		temp->data = n;

		/* 3. assigns the next to be null for now*/
		temp->next = NULL;

		// checking if adding to the list or not depending on if the list is full

		// if head is null then adds the head and tail are the temp
		if (head == NULL)
		{
			head = temp;
			tail = temp;
		}

		// adds it to the end of the list
		else
		{
			tail->next = temp;
			tail = tail->next;
		}
	}

	void push(int n)
	{
		/* 1. create the node*/
		Node* temp = new Node;
		
		/* 2. assign the data to the node*/
		temp->data = n;

		/* 3. have the next of the temp point to the head*/
		temp->next = head;

		/* reassign the head to the temp we created*/
		head = temp;
	}

	void insertAfter(Node* a, int n)
	{
		/* 1. create the node */
		Node* temp = new Node;

		/* 2. assign the data to the new node*/
		temp->data = n;

		/* 3. assign the temp of the next to 2nd half of the linked list*/
		temp->next = a->next;

		/* 4. have the first node be connected to the temp node*/
		a->next = temp;

	}



	void printList()
	{
		Node* temp;
		temp = head;

		while (temp != NULL)
		{
			std::cout << temp->data <<"-->";
			temp = temp->next;
		}
		std::cout << "NULL";
	}
};

int main()
{
	Linked_List a;
	a.add_Node(6);
	a.add_Node(5);
	a.add_Node(4);
	a.printList();
	return 0;
}