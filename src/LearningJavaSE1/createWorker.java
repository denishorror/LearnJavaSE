package LearningJavaSE1;

public class createWorker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker = new Worker ("����", "����������", 40000);
		int month = 8;
		System.out.println ("��������� " + worker.name + ", ��������� " + worker.position + " ������� �� " + month + " ������� " + worker.totalSalary(month) + " ������" );
	}

}
