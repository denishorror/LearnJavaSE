package Collections;

import java.util.ArrayList;

public class MainHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>(); 
		
		names.add("��������");
		names.add("������");
		names.add("�����");
		names.add("����");
		names.add("������");
		names.add("���� I");
		names.add("���� II");
		names.add("���� III");
		names.add("���� IV");
		names.add("���� V");
		
		
		ArrayList<Integer> numbers = new ArrayList<>(); 
		
		numbers.add(18);
		numbers.add(14);
		numbers.add(1);
		numbers.add(8);
		numbers.add(17);
		numbers.add(16);
		numbers.add(12);
		numbers.add(9);
		numbers.add(7);
		numbers.add(5);
		
		ArrayList<String> summary = new ArrayList<>(); 
		
		for (int i = 0; i < numbers.size(); i++) {
			summary.add (names.get(i) + " - " + numbers.get(i));	
		}
		
		for (String s : summary) {
			System.out.println (s);
		}

	}

}
