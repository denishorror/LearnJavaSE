package Interface;

public class Bird extends Animal implements CanRun, Flyable {
	
	@Override
	public void eat() {
		System.out.println ("ѕтичий корм");		
	}

	@Override
	public void run() {
		System.out.println ("ѕтица бежит");
		
	}

	@Override
	public void fly() {
		System.out.println ("ѕтица летит");
		
	}

}
