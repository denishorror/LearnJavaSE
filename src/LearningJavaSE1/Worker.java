package LearningJavaSE1;

public class Worker {
	String name;
	String position;
	int salary;
	
	public Worker(String name, String position, int salry) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salry;
	}
	
	int totalSalary (int i) {
		int totlaSalary = salary * i;
		return totlaSalary;
		
	}

}
