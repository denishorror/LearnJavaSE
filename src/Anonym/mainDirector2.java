package Anonym;

public class mainDirector2 {

	public static void main(String[] args) {
		Director2 director = new Director2();

        //ѕервый способ анонимный класс, метод принимает 2 аргумента - первый counter, потом через зап€тую указываем число мес€цев.
        director.force(new Counter() {
            @Override
            public String report(int countOfMonths) {
                return "ќтчет за " + countOfMonths + " мес€цев";
            }
        }, 12);

        //¬торой способ
        MyCounter counter = new MyCounter();
        director.force(counter, 12);
    }
}
