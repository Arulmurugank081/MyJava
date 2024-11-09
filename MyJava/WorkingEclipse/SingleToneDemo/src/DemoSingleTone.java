
class SingleTone
{
	private SingleTone()
	{
		
	}
	
	private  static SingleTone obj1 = null;
	
	static public  SingleTone GetObj()
	{
		if(obj1 == null)
		{
			obj1 = new SingleTone();
		}
		
		return obj1;
	}
}


public class DemoSingleTone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleTone s = SingleTone.GetObj();
		SingleTone s1 = SingleTone.GetObj();
		if( s == s1)
			System.out.println("Same");

	}

}
