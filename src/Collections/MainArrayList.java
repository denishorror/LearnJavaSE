package Collections;
import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {

		ArrayList<String> employees = new ArrayList<>(); 
		
		employees.add("��������");
		employees.add("������");
		employees.add("�����");
		employees.add("����");
		employees.add("������");
		employees.add("���� I");
		employees.add("���� II");
		
		//employees.remove(6);
		employees.remove("���� I");
		
		/*
		 * for (int i = 0; i < employees.size(); i++) { System.out.println
		 * (employees.get(i)); }
		 */
		
		for (String name : employees) {
			System.out.println (name);
		}
	}

}
