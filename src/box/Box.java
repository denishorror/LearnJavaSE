package box;

public class Box {
	
	protected double heigth;
	protected double width;
	protected double length;
	
	protected Box(double height, double width, double lenght) {
		this.heigth = height;
		this.width = width;
		this.length = lenght;
	}
	
	public Box (double size)	{
		width=size;
		heigth=size;
		length=size;
	}
	
	public Box () {
		width=0;
		heigth=0;
		length=0;
	}
	
	protected Box (Box box) {
		this.width = box.width;
		this.heigth = box.heigth;
		this.length = box.length;
	}
	
	protected Box (Box box1, Box box2) {
		this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.heigth = box1.heigth + box2.heigth;
	}
	
	void setDimens (double width, double heigth, double length ) {
		this.width = width;
		this.heigth = heigth;
		this.length = length;
	}
	
	Box increase (int i) {
		return new Box (width * i, heigth * i, length *i);
	}
	
	Box summaryBox (Box box) {
		return new Box (width + box.width, heigth + box.heigth, length + box.length);
	}

	
	void showVolume () {
		System.out.println(volume ());
	}
	
	public void showInfo () {
		System.out.println("Высота: " + heigth);
		System.out.println("Ширина: " + width);
		System.out.println("Длинна: " + length);
	}
			
	double volume() {
		double volume = heigth * length * width;
		return volume;
	}
	
	int compare (Box box) {
		double thisVolume = volume ();
		double  boxVolume = box.volume();
		int result;
		if (thisVolume > boxVolume) {
			System.out.println ("Наша коробка больше");
			//return 1;
			result = 1;
		} else if (thisVolume < boxVolume) {
			System.out.println ("Наша коробка меньше");
			//return -1;
			result = -1;
		} else {
			System.out.println ("Коробки равны");
			//return 0;
			result = 0;
		}
		return result;
	}

	

}
