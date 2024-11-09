
public class Main {

	public static void main(String [] s)
	{
	   ThreadDemo t = new ThreadDemo();
	   t.start();
	   
	   while(true)
		{
			System.out.println("World");
		}
	}

}
