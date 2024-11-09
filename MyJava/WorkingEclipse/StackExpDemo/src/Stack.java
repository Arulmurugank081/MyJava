
public class Stack {
	public int top = -1;
	public int size = 5;
	public int list[];
	
	Stack()
	{
		list = new int[size];
	}
	
	void push(int n) throws StackOverFlowExption
	{
		if(top == size-1)
			throw new StackOverFlowExption();
		
		list[++top] = n;		
	}
	
	void pop() throws StackUnderFlowExption
	{
		if(top == -1)
			throw new StackUnderFlowExption();
		
		list[top] = 0;
		top--;
	}
	
	void showStack()
	{
		for(int i: list)
		{
			System.out.println(i);
		}
	}

}
