package Inheritance;

public class Cat extends CatFamily {
	public Cat () {
		//setBigClaws (false);
		super (2,4,false);		
	}
	
	@Override
	public void eat () {
		super.eat();
		System.out.println ("whiskas");
	}
}
