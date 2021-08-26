package box;

public class createBox {

	public static void main(String[] args) {
		
		Box box1 = new Box (10);
		Box box2 = box1.increase(2);
		box1.showVolume();
		box2.showVolume();
		//Box box2 = new Box (box1);		
		//box1.setDimens (100,100,100);
		/*Box box1= new Box(100);
		Box box2= new Box(15, 20, 25);*/
		int result = box1.compare(box2);
		
		switch (result) {
			case -1:
				System.out.println ("<");
				break;
			case 1:
				System.out.println (">");
				break;
			case 0:
				System.out.println ("=");
				break;
		}

		Box box3 = box1.summaryBox(box2);
		box3.showVolume();


	}

}
