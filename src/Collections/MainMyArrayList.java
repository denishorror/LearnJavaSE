package Collections;

public class MainMyArrayList {
	public static void main(String[] args) {
		MyArrayList employees = new MyArrayList();
		
		employees.add("��������");
		employees.add("������");
		employees.add("�����");
		employees.add("����");
		employees.add("������");
		employees.add("���� I");
		employees.add("���� II");

		//employees.remove(6);
		employees.remove("���� I");
		
		for ( int i = 1; i <= 10; i++) {
			employees.add ("���� " + i);
		}
		
		for (int i = 0; i < employees.getSize(); i++) {
			System.out.println (employees.get(i));
		}
	}
	
}
