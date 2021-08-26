package Inheritance;

public class CatFamily {
	private int ears;
	private int legs;
	private boolean bigClaws;
	
	/*
	 * public CatFamily () { ears = 2; legs = 4; bigClaws = true; }
	 */
	
	public void showInfo () {
		System.out.println("Количество ушей: " + ears + " Количество лап: " + legs + " Наличие больших когтей:" + bigClaws);
	}

	public void eat () {
		System.out.println ("Кушаю ");
	}
	
	// constructor
	
	public CatFamily(int ears, int legs, boolean bigClaws) {
		super();
		this.ears = ears;
		this.legs = legs;
		this.bigClaws = bigClaws;
	}

	// getters / setters
	
	public int getEars() {
		return ears;
	}

	public void setEars(int ears) {
		this.ears = ears;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public boolean isBigClaws() {
		return bigClaws;
	}

	public void setBigClaws(boolean bigClaws) {
		this.bigClaws = bigClaws;
	}

	
}
