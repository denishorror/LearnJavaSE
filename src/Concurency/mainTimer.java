package Concurency;

public class mainTimer {

	public static void main(String[] args) {
		//RunnableTimer runnableTimer = new RunnableTimer();
		//Thread timer = new Thread (runnableTimer);
		Thread timer = new Thread (new Runnable() {
			@Override
			public void run() {
				try {
					for (int i = 0; i < 1000000; i++) {
					System.out.println(1);
					Thread.sleep(1000);
					}
				} catch (Exception e) {
						
				}				
			}	
		});
		timer.start();
		Thread timer2 = new Thread (new Runnable() {
			@Override
			public void run() {
				try {
					for (int i = 0; i < 1000000; i++) {
					System.out.println(2);
					Thread.sleep(1000);
					}
				} catch (Exception e) {
						
				}			
			}	
		});
		timer2.start();
		//for (int i = 0; i < 1000000; i++) {
		//	System.out.println(2);
		//}
	}

}
