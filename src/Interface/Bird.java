package Interface;

public class Bird extends Animal implements CanRun, Flyable {
	
	@Override
	public void eat() {
		System.out.println ("������ ����");		
	}

	@Override
	public void run() {
		System.out.println ("����� �����");
		
	}

	@Override
	public void fly() {
		System.out.println ("����� �����");
		
	}

}
