package Collections;
import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {

		ArrayList<String> employees = new ArrayList<>(); 
		
		employees.add("Василина");
		employees.add("Дениза");
		employees.add("Денис");
		employees.add("Котя");
		employees.add("Платон");
		employees.add("Гнум I");
		employees.add("Гнум II");
		
		//employees.remove(6);
		employees.remove("Гнум I");
		
		/*
		 * for (int i = 0; i < employees.size(); i++) { System.out.println
		 * (employees.get(i)); }
		 */
		
		for (String name : employees) {
			System.out.println (name);
		}
	}

}
