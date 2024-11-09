class HodaCity
{
	static double price = 10;
	int i = 10;
	
	static double test(String s)
	{
		//i =20; //non static memeber, this,super are  cant access inside the static method
		switch(s)
		{
		case "delhi":
			price =  price * 0.9;
			break;
		case "chennai":
		   price = price * 0.8;
		   break;		
		}
		
		return price;
		
	}
	
}


public class DemoStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HodaCity h1 = new HodaCity();
		HodaCity h2 = new HodaCity();
		
		h1.price = 30;
		
		System.out.println(HodaCity.price);
		System.out.println(h2.price);
		System.out.println(HodaCity.test("chennai"));
		

	}

}
