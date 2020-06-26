
#include <iostream>

struct Node {
public:
	int data;
	struct Node* next;
};

// insert a new node in front of the list
void push(struct Node** head, int node_data)
{
	/* 1. create and allocate Node*/
	struct Node* newNode = new Node;

	/* 2. assign data to node */
	newNode->data = node_data;

	/* 3. set next to the head */
	newNode->next = (*head);

	/* 4. move the head to the new node */
	(*head) = newNode;
}

// delete first node in the linked list
Node* deleteFirstNode(struct Node* head)
{
	if (head == NULL)
		return NULL;

	Node* tempNode = head;
	head = head->next;
	delete tempNode;

	return head;
}



void insertAfter(struct Node* prev_node, int node_data)
{
	/* 1. check if the given prev_node is NULL*/
	if (prev_node == NULL)
	{
		std::cout << "the given node was NULL";
		return;
	}

	/* 2. create the new node */
	struct Node* newNode = new Node;

	/* 3. Assign data to the node*/
	newNode->data = node_data;

	/* 4. set the next of the new node to the one of the previous node*/
	newNode->next = prev_node->next;

	/* 5. prev_node.next = new node*/
	prev_node->next = newNode;
}



void append(struct Node** head, int node_data)
{

	/* 1. create and allocate node*/
	struct Node* newNode = new Node;


	/* 2. assign data to the node*/
	newNode->data = node_data;

	/* 3. set next pointer of new node to null as its last node */
	newNode->next = NULL;

	/* 4. if list is empty, new node becomes first node*/
	if (*head == NULL)
	{
		*head = newNode;
		return;
	}

	/* 5. Else traverse till the last node*/
	struct Node* last = *head;

	while (last->next != NULL)
		last = last->next;

	/* 6. Change the pointer to the new node*/
	last->next = newNode;
	return;
}

Node* removeLastNode(struct Node* head)
{
	if (head == NULL)
		return NULL;

	if (head->next == NULL)
	{
		delete head;
		return NULL;
	}

	// 1. Find second last Node
	Node* second_last = head;
	while (second_last->next->next != NULL)
	{
		second_last = second_last->next;
	}

	// Delete the last Node
	delete (second_last->next);

	// set next of second_last to null
	second_last->next = NULL;

	return head;
}


void printList(struct Node* node)
{
	while (node != NULL)
	{
		std::cout << node->data << "-->";
		node = node->next;
	}

	if (node == NULL)
		std::cout << "null";
}

int main()
{
	struct Node* head = NULL;

	append(&head, 10);

	push(&head, 20);

	push(&head, 30);

	append(&head, 40);

	insertAfter(head->next, 50);

	std::cout<<"Final linked List: " << std::endl;
	printList(head);
	return 0;

}