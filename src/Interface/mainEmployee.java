package Interface;

import java.util.ArrayList;

public class mainEmployee {

	public static void main(String[] args) {

		Programmer programmer1 = new Programmer("Иван");
	    Programmer programmer2 = new Programmer("Николай");
	    Programmer programmer3 = new Programmer("Алена");
	    Driver driver1 = new Driver("Ашот");
	    Driver driver2 = new Driver("Мага");
	    Driver driver3 = new Driver("Кухолякак");
	    Cook cook1 = new Cook("Машка");
	    Cook cook2 = new Cook("Прошка");
	    Cook cook3 = new Cook("Маришка");
		
		ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(cook1);
        employees.add(cook2);
        employees.add(cook3);
        
        for (Employee employee : employees) {
            employee.voice();
        }
        
        ArrayList<Programmer> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);
        for (Programmer programmer : programmers) {
        	programmer.programming();
        }
        
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for (Driver driver : drivers) {
        	driver.driving();
        }
        
        ArrayList<Cook> cookers = new ArrayList<>();
        cookers.add(cook1);
        cookers.add(cook2);
        cookers.add(cook3);
        for (Cook cook : cookers) {
        	cook.cooking();
        }

	}

}
