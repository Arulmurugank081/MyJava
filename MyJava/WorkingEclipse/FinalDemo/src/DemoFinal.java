
class Test
{
	final int MAX = 10;
	final static int MIN;
	final  int NOR;
	final int BAL;
	{
	  BAL = 11;
	}
	
	static
	{
		MIN = 5;
	}
	Test()
	{
		NOR = 1;
	}
}

final class Super
{
	 void test()
	{
		System.out.println("Hello");
	}
}

class sub extends Super
{
	void test()
	{
		System.out.println("Sub");
	}
}
public class DemoFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
