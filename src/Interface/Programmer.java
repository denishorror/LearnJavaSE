package Interface;

public class Programmer extends Employee implements Programmable  {

	public Programmer(String name) {
        super(name);
    }

	@Override
	public void programming() {
		System.out.println("ѕишу код.");
		
	}
}
