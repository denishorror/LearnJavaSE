package Interface;

public class Driver extends Employee implements Driveable  {

	public Driver (String name) {
        super(name);
    }

	@Override
	public void driving() {
		System.out.println("Веду машину.");
		
	}
}