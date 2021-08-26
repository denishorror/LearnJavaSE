package Interface;

public class Cat extends Animal implements CanRun {
	
	@Override
	public void eat() {
		System.out.println ("Whiskas");		
	}
	
	public void run () {
		System.out.println ("Кот бежит");
	}

}
