import java.util.EmptyStackException;

public class StackQueue 
{
	private int num_of_entries;
	private LinkedStack Stack1 = null;
	private LinkedStack Stack2 = null;
	
	public StackQueue()
	{
		num_of_entries=0;
		Stack1 = new LinkedStack();
		Stack2 = new LinkedStack();
	}
	
	public void enqueue(int x)
	{
		while(!Stack1.isEmpty())
		{
			Stack2.push(Stack1.pop());
		}
		
		Stack1.push(x);
		
		while(!Stack2.isEmpty())
			Stack1.push(Stack2.pop());
	}
	
	public int dequeue()
	{
		if(Stack1.isEmpty())
		{
			System.out.println("Q is Empty");
			System.exit(0);
		}
		
		
		return Stack1.pop();
			
	}
	

}
