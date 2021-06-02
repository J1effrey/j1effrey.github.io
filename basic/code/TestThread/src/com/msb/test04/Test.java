package com.msb.test04;

public class Test {
    public static void main(String[] args) {
        // 定义一个线程对象
        BuyTicketThread t = new BuyTicketThread();
        BuyTicketThread2 tt = new BuyTicketThread2();
        // 窗口1
        Thread t1 = new Thread(t, "窗口1");
        t1.start();
        // 窗口2
        Thread t2 = new Thread(t, "窗口2");
        t2.start();
        // 窗口3
        Thread t3 = new Thread(t, "窗口3");
        t3.start();
    }
}
