package LearningJavaSE1;

public class Dog {
	String name;
	String kind;
	int speed;
	
	void run () {
		int i = 1;
		while ( i <= speed  ) {
			System.out.println ("����");
			i++;
		}
	}
	
	String info () {
		String info = "���:" + name + ", ������:" + kind + ", ��������:" + speed;
		return (info);
	}
}
