package JavaRush;

public class Car {

    public static int carCounter = 10;

    private String description = "Начальное значение поля description";

    public Car() {
        System.out.println("Привет из конструктора Car!");
    }

    public String getDescription() {
        return description;
    }
}
