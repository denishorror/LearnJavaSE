package LearningJavaSE1;

public class createDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog ();
		dog.speed = 6;
		dog.name = "�����";
		dog.kind = "������";
		
		
		dog.run();
		
		String info = dog.info();
		System.out.println (info);
	}

}
