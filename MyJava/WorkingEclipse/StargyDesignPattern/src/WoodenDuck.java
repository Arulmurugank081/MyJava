
public class WoodenDuck extends Duck{
	public WoodenDuck() {
		
		m_flyableBehavior = new NoFly();
		m_quakBehavior = new NoQuak();
		
	}

	public void Display()
	{
		System.out.println("This is wooden duck");
	}
	
}
