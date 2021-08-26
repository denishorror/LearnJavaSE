package LearningJavaSE1;

public class Monster {
	int eyes;
	int foots;
	int hands;
	
	
	public Monster() {
		super();
		eyes = 2;
		foots = 2;
		hands = 2;
	}


	public Monster(int eyes) {
		super();
		this.eyes = eyes;
		foots = 2;
		hands = 2;
	}


	public Monster(int eyes, int foots) {
		super();
		this.eyes = eyes;
		this.foots = foots;
		hands = 2;
	}


	public Monster(int eyes, int foots, int hands) {
		super();
		this.eyes = eyes;
		this.foots = foots;
		this.hands = hands;
	}
	
	void voice () {
		System.out.println ("Голос 1");
	}
	
	void voice (int i) {
		for (int j=1; j<=i; j++) {
			System.out.println ("Голос 2");
			}
	}
	
	void voice (int i, String word) {
		for (int j=1; j<=i; j++) {
		System.out.println (word);
		}
	}

}
