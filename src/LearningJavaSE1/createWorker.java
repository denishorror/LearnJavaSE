package LearningJavaSE1;

public class createWorker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker = new Worker ("Петр", "санитайзер", 40000);
		int month = 8;
		System.out.println ("Сотрудник " + worker.name + ", должность " + worker.position + " получил за " + month + " месяцев " + worker.totalSalary(month) + " рублей" );
	}

}
