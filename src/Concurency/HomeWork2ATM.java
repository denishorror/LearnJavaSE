package Concurency;

public class HomeWork2ATM {
    static volatile long totalSum = 1000;
    static Object monitor = new Object();
//    static Object monitor;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm("Денис", 500);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    thread1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                atm("Максим", 400);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    thread2.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                atm("Новиков", 200);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
//        try {
//            thread1.join();
//            thread2.join();
//            thread3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

    public static void atm(String name, long sum) {
        synchronized (monitor) {
            {
                System.out.println(name + " подошел к банкомату");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (sum <= totalSum) {
                    totalSum = totalSum - sum;
                    System.out.println(name + " вывел " + sum + " рублей. В банкомате осталось " + totalSum + " рублей.");
                } else {
                    System.out.println("В банкомате недостаточно денег для " + name);
                }
            }
        }
    }
}

