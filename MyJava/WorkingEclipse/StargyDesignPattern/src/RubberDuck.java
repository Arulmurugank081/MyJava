
public class RubberDuck extends Duck {
	
	public RubberDuck() {
		m_flyableBehavior = new Fly();//  flyable;
		m_quakBehavior = new Quak();// quak;
		
	}
	public void Display() {
		System.out.println("This is Rubber Duck");		
	}
	
}
