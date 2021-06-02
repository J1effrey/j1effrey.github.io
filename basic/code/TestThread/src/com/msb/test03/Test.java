package com.msb.test03;

public class Test {
    public static void main(String[] args) {
        TestThread tt = new TestThread();
        Thread t = new Thread(tt, "子线程");
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
