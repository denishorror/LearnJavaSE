package Interface;

public class Cook extends Employee implements Cookable  {

	public Cook(String name) {
        super(name);
    }

	@Override
	public void cooking() {
		System.out.println("Готовлю еду.");
		
	}
}
