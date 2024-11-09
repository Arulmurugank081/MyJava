
public class MethodOverriddingDemo {
	
	public static void main(String str[])
	{
		Super su = new Super();
		su.display();
		
		Sub sb = new Sub();
		sb.display();
		
		//Dynamic method dispatch
		Super sd = new Sub();
		sd.display();
	}

}
