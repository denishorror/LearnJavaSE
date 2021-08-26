package Inheritance;

public class mainFigure {

	public static void main(String[] args) {
		Rect rect = new Rect (5, 10);
		Triangle triangle = new Triangle (10); 
		System.out.println (rect.area());
		System.out.println (triangle.area());	
	}

}
