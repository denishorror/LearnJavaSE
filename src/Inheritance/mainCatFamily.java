package Inheritance;

public class mainCatFamily {

	public static void main(String[] args) {
		Cat cat = new Cat(); 
		Lion lion = new Lion();
		cat.showInfo();
		lion.showInfo();
		cat.eat();
		lion.eat();
	}

}
