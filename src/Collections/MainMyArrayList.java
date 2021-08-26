package Collections;

public class MainMyArrayList {
	public static void main(String[] args) {
		MyArrayList employees = new MyArrayList();
		
		employees.add("Василина");
		employees.add("Дениза");
		employees.add("Денис");
		employees.add("Котя");
		employees.add("Платон");
		employees.add("Гнум I");
		employees.add("Гнум II");

		//employees.remove(6);
		employees.remove("Гнум I");
		
		for ( int i = 1; i <= 10; i++) {
			employees.add ("Гнум " + i);
		}
		
		for (int i = 0; i < employees.getSize(); i++) {
			System.out.println (employees.get(i));
		}
	}
	
}
