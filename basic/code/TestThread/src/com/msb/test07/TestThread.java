package com.msb.test07;

public class TestThread extends Thread {
    public TestThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + "-----" + i);
        }
    }
}

class Test{
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            if (i == 6) {
                TestThread tt = new TestThread("子线程");
                tt.start();
                tt.join();
            }
            System.out.println("main----"+i);
        }
    }
}
