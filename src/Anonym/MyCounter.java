package Anonym;

public class MyCounter implements Counter {
    @Override
    public String report(int countOfMonths) {
        return "����� �� " + countOfMonths + " �������";
    }
}
