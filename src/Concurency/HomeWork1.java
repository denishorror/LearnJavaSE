package Concurency;

import java.util.ArrayList;

public class HomeWork1 {

    static float[] array;
    static int SIZEOFARRAY = 50000000;

    public static void main(String[] args) {

        array = new float[SIZEOFARRAY];
        for (int i = 0; i < SIZEOFARRAY; i++) {
            array[i]=1F;
        }
        withoutConcurency();
        withConcurency();

    }

    public static void withoutConcurency() {


//         старт
        long beforeTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long afterTime = System.currentTimeMillis();
//        финиш
        System.out.println("without Concurency: " + (afterTime - beforeTime));
    }

    public static void withConcurency() {
        //          старт
        long beforeTime = System.currentTimeMillis();
        float[] array1 = new float[SIZEOFARRAY / 2];
        float[] array2 = new float[SIZEOFARRAY / 2];
        System.arraycopy(array,0,array1, 0, array.length / 2);
        System.arraycopy(array,0,array2, 0, array.length / 2);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array1.length; i++) {
                    array1[i] = (float) (array1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array2.length; i++) {
                    array2[i] = (float) (array2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
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
        System.arraycopy(array1,0,array, 0,array.length / 2);
        System.arraycopy(array2,0,array,array.length / 2, array.length / 2);

        long afterTime = System.currentTimeMillis();
//        финиш
        System.out.println("with Concurency: " + (afterTime - beforeTime));
    }
}
