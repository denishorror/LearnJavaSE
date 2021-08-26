package Interface;

public class mainDog {

	public static void main(String[] args) {
		Dog dog = new Dog();
		CanRun canRun = dog;
		dog = (Dog) canRun;
		Flyable flyable = new Bird();
		flyable.fly();

	}

}
