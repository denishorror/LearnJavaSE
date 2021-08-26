package Exceptions;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		try {
			int b = 7 / a;
			String s = "dllkgf1";
			int i = Integer.parseInt(s);
		} catch (ArithmeticException e) {
			System.out.println("На 0 делить нельзя!");
		} catch (Exception e1) {

		}
		
		System.out.println("Привет!");
	}

}
