package Concurency;

public class MainQueue {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    System.out.println("Counter: " + i);
                    i++;
                    Runnable task = null;
                    try {
                        task = blockingQueue.take();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    new Thread(task).start();
                }
            }
        }).start();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            blockingQueue.add(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("---" + index);
                }
            });
        }
    }
}
