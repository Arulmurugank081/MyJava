
abstract class Super
{
	public void Method1()
	{
		System.out.println("Method One");
	}
	
	abstract void Method2();	
}

class Sub
{
	public void Mehod2()
	{
		System.out.println("Method Two");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Super sup;
		
		Sub sub = new Sub();
	    
		sub.Mehod2();
	

	}

}
