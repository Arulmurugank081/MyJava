
public class DuckApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck d = new RubberDuck();
		d.DuckBehavior();
		//d.SetFlayableBehaviour(new Fly());
		//d.DuckBehavior();
		
		Duck d1 = new WoodenDuck();
		d1.DuckBehavior();

	}

}
