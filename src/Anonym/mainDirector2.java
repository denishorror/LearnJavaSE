package Anonym;

public class mainDirector2 {

	public static void main(String[] args) {
		Director2 director = new Director2();

        //������ ������ ��������� �����, ����� ��������� 2 ��������� - ������ counter, ����� ����� ������� ��������� ����� �������.
        director.force(new Counter() {
            @Override
            public String report(int countOfMonths) {
                return "����� �� " + countOfMonths + " �������";
            }
        }, 12);

        //������ ������
        MyCounter counter = new MyCounter();
        director.force(counter, 12);
    }
}
