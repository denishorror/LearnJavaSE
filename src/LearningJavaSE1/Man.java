package LearningJavaSE1;

public class Man {
	private String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if (age > 0 ) {
			this.age = age;
		} else {
			System.out.println ("Возраст должен быть больше 0");
		}
	}

	public Man(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void showInfo () {
		System.out.println ("Имя: " + name);
		System.out.println ("Возраст: " + age);
	}
}
