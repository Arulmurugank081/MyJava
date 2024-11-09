
//static block indrocedured in java1.7 version.
class Test
{
	static {
		System.out.println("Block1");
	}
	static
	{
		System.out.println("Block2");
	}
	
}

class Test2
{
	static int i = 10;
	int kk = 0;
	
	static class inner
	{			
		public static int kk = 0;
		static int T()
		{
			i = 20;
			return i;
		}
	}
	
		
}
public class StaticBlocksDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main");
		Test t = new Test();
		
		Test2.inner t2= new Test2.inner();
	    System.out.println(Test2.inner.kk);
	    System.out.println(Test2.inner.T());
		

	}

}
