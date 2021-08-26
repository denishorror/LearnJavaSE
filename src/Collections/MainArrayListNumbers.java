package Collections;

import java.util.ArrayList;

public class MainArrayListNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			numbers.add(i);
		}
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		System.out.println (sum);
	}

}
