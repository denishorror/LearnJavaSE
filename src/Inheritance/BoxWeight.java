package Inheritance;
import box.Box;

public class BoxWeight extends Box{
	
	private double weigth;
	
	protected BoxWeight() {
		super();
		this.weigth = 0;
	}
	
	public BoxWeight (double height, double width, double lenght, double weigth) {
		super (height, width, lenght);
		this.weigth = weigth;
	}
	
	protected BoxWeight (double size, double weigth)	{
		super (size);
		this.weigth=weigth; 

	} 
	
	@Override
	public void showInfo () {
		super.showInfo();
		System.out.println("Вес: " + weigth);
	}
	
	// getters / setters

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
		
	
	
}
