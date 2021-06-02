package com.msb.test02;

public class BuyTicketThread extends Thread {
    public BuyTicketThread(String name){
        super(name);
    }
    // 一共10张票:
    final String a = "abc";
    static Object o = new Object();
    static int ticketNum = 10;
    @Override
    public void run() {
        // 每个窗口都是一个线程对象：每个对象执行代码放入run方法
        for (int i = 0; i < 100; i++) {
            /*synchronized (BuyTicketThread.class) { // 锁必须多线程用的同一把锁！！！
                // a = "def";
                if (ticketNum > 0) { // 对票数判断 票数大于零 我们才抢票
                    System.out.println("我在"+this.getName()+"买到了第" + ticketNum-- + "张车票");
                }
            }*/
            buyTicket();
        }
    }

    public static synchronized void buyTicket() {
        if (ticketNum > 0) { // 对票数判断 票数大于零 我们才抢票
            System.out.println("我在"+Thread.currentThread().getName()+"买到了第" + ticketNum-- + "张车票");
        }
    }
}
