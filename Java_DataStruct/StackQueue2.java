
public class StackQueue2 
{
	private int number_of_entries;
	private LinkedStack Stack1;
	private LinkedStack Stack2;
	
	public StackQueue2()
	{
		Stack1 = new LinkedStack();
		Stack2 = new LinkedStack();
	}
	
	public void enqueue(int x)
	{
		Stack1.push(x);
	}
	
	public int dequeue()
	{
		if(Stack1.isEmpty() && Stack2.isEmpty())
		{
			System.err.print("Both stacks are empty");
			System.exit(0);
		}
		
		if(Stack2.isEmpty())
		{
			while(!Stack1.isEmpty())
			{
				Stack2.push(Stack1.pop());
			}
		}
		
		int value_to_be_returned = Stack2.pop();
		return value_to_be_returned;
		
	}

}
