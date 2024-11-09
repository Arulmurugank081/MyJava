
public class RunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myT = new MyThread();
		
		Thread t = new Thread(myT);
		
		t.start();
		
		while(true)
		{
			System.out.println("World");
		}

	}

}
