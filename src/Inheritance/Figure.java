package Inheritance;

public abstract class Figure {
	private double a;
	private double b;
	
	public Figure(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public abstract double area ();

	// getters / setters 
	
	public final double getA() {
		return a;
	}

	public final void setA(double a) {
		this.a = a;
	}

	public final double getB() {
		return b;
	}

	public final void setB(double b) {
		this.b = b;
	}
	
	

}
