package Concurency;

public class MainCounter2 {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        Counter2 counter = new Counter2();
        int barrier = 1000;
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.inc();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.dec();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getValue());

        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
