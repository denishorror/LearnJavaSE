package Interface;

import java.util.ArrayList;

public class mainAnimals {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		Dog dog4 = new Dog();
		Dog dog5 = new Dog();
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();
		Cat cat4 = new Cat();
		Cat cat5 = new Cat();
		Bird bird1 = new Bird();
		Bird bird2 = new Bird();
		Bird bird3 = new Bird();
		Bird bird4 = new Bird();
		Bird bird5 = new Bird();
		Fish fish = new Fish();
		ArrayList<CanRun> animals = new ArrayList<>();
		animals.add(dog1);
		animals.add(cat1);
		animals.add(bird1);
		animals.add(dog2);
		animals.add(dog3);
		
		for (CanRun animal : animals) {
			animal.run();
		}
	}

}
