package LearningJavaSE1;

public class Dog {
	String name;
	String kind;
	int speed;
	
	void run () {
		int i = 1;
		while ( i <= speed  ) {
			System.out.println ("бегу");
			i++;
		}
	}
	
	String info () {
		String info = "Имя:" + name + ", Порода:" + kind + ", Скорость:" + speed;
		return (info);
	}
}
