package Collections;
import my.p;

public class MainHowItWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] employees = {
			"��������", "������", "����", "������", "�����"
		};
		
		
		// ��������� ���������
		String [] second = new String [employees.length + 1]; 
		for (int i = 0; i < employees.length; i++) {
			second [i] = employees [i];
		}
		second[second.length - 1] = "����";
		employees = second;
		
		// ������� ���������
		employees [2] = null; //  �������
		String [] newNames = new String [employees.length - 1];
		for (int i = 0, j = 0; i < employees.length; i++) {
			if (employees [i] != null) {
				newNames[j] = employees [i];
				j++;
			}
		}
		employees = newNames;
		
		
		for (String name : employees) {
			System.out.println (name);
		}
	}

}
