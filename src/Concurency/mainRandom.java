package Concurency;

public class mainRandom {
	static boolean win = false;
	public static void main(String[] args) {
		
		int random = (int) (Math.random() * 1000000000);
		System.out.println(random);
		
		Thread timer = new Thread (new Runnable() {
			@Override
			public void run() {
				try {
					int i = 0;					
					while (!win) {
						System.out.println(i);
						i++;
						Thread.sleep(1000);
					}
				} catch (Exception e) {
						
				}				
			}	
		});
		
		
		Thread player = new Thread (new Runnable() {
			@Override
			public void run() {
				while (!win) {
					int guessNumber = (int) (Math.random() * 1000000000);
					if (guessNumber == random) {
						win = true;
						System.out.println(guessNumber);
					}
				}			
			}	
		});
		timer.start();
		player.start();

	}

}
