import java.util.*;
class MinBal extends Exception
{
	public String toString()
	{
		return "Insufficent balance, should be min 5000";
	}
}
public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b =2,c;
		try
		{
			throw new MinBal();
		
		} 
		catch(MinBal e)
		{
			System.out.println(e.toString());
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Should not be zero try again");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		finally
		{
			System.out.println("Finally");
		}
		
		System.out.println("Bye");
		
					
		
		
		

	}

}
