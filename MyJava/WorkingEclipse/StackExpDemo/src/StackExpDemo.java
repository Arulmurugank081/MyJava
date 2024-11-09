import java.util.*;
public class StackExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Stack s = new Stack();
			
			Scanner sc = new Scanner(System.in);
		
			boolean b = true;
			while(b)
			{
				int c = sc.nextInt();
				
				switch(c)
				{
				case 1:
					System.out.println("Enter the value to insert to the Stack :");
					int i = sc.nextInt();				
					try
					{
						s.push(i);
					}
					catch(StackOverFlowExption e)
					{
						System.out.println(e.toString());
					}
					break;
					
				case 2:
					System.out.println("Pop operation");
					try
					{
						s.pop();
					}
					catch(StackUnderFlowExption e)
					{
						System.out.println(e.toString());
					}
					break;
					
				case 3:
					System.out.println("Stack Data");
					s.showStack();
					break;
				case 4:
					System.out.println("Top value:" + s.top);
					break;
					
				case 5:
					b = false;
					break;
				}
			}
		
		
		 

	}

}
