
abstract public class Duck {
	/*Duck(FlyableBehavior flyable, QuakBehavior quakable)
	{
		m_flyableBehavior = flyable;
		m_quakBehavior = quakable;		
	}*/
	
	abstract public void Display();
	public void DuckBehavior()
	{
		m_flyableBehavior.Flayable();
		m_quakBehavior.Quakable();
	}
	
	public FlyableBehavior m_flyableBehavior;
	public QuakBehavior m_quakBehavior;
	
	public void SetFlayableBehaviour(FlyableBehavior flyable)
	{
		m_flyableBehavior = flyable;
	}	
}
