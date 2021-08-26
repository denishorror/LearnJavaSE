package main;
import LearningJavaSE1.myMath;
import my.p;

public class createMyMath {

	public static void main(String[] args) {

		int square = myMath.square(20);
		p.p(square);
		
		double length = myMath.length(10);
		p.p(length);
		
		int sum = myMath.sum(20,21,45);
		p.p(sum);
	}
	
}






