package Interface;

public class Employee {
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public final String getName() {
		return name;
	}
	
    public void voice() {
        System.out.println(name);
    }


}
