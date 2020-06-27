#include <iostream>
#include <exception>

struct Node
{
	int data;
	Node* next;
};


class Linked_List
{
private:
	Node *head, *tail;
	int number_of_entries;
public:
	Linked_List()
	{
		head = NULL;
		tail = NULL;
		number_of_entries = 0;
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


		number_of_entries++;
		
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

	// deletes one selected node in the middle of the list
	void del(Node* before_del)
	{
		try
		{
			before_del;
		}

		catch (const std::invalid_argument& ia)
		{
			std::cerr << " Node is Null:" << ia.what() << '\n';
		}

		/* 1. create a node */
		Node* temp;

		/* 2. create a temporary pointer to the node to be deleted*/
		temp = before_del->next;

		/* 3. Connecting the predecessor of the deleted to the successsor of the deleted */
		before_del->next = temp->next;

		/* 4. delete the node*/
		delete temp;

		number_of_entries--;
		

		
		
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

		number_of_entries++;
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

		number_of_entries++;
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

	Node* getHead()
	{
		return head;
	}

	Node* returnNthNode(int position)
	{
		Node* temp = head;
		int i = 0;
		

		for(int i=0;i<position;i++)
		{
			temp = temp->next;
		}
		return temp;
	}

	int getEntries()
	{
		return number_of_entries;
	}

	void getStatus()
	{
		std::cout << "The linked list has " << number_of_entries << "."<<std::endl;
	}
};

int main()
{
	Linked_List a;
	a.add_Node(6);
	a.add_Node(5);
	a.add_Node(4);
	a.getStatus();
	a.printList();

	a.del(a.getHead()->next);
	a.printList();
	return EXIT_SUCCESS;
}