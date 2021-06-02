package com.msb.test04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BuyTicketThread implements Runnable{
    int ticketNum = 10;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        // 此处有1000行代码
        for (int i = 0; i < 100; i++) {
            /*synchronized (this) { // 把具有安全隐患的代码锁住即可，如果锁多了就会效率低 --> this 就是这个锁
                if (ticketNum > 0) { // 对票数判断 票数大于零 我们才抢票
                    System.out.println("我在"+Thread.currentThread().getName()+"买到了第" + ticketNum-- + "张车票");
                }
            }*/
            buyTicket();
        }
        // 此处有1000行代码
    }

    public synchronized void buyTicket() { // 锁住的是this
        if (ticketNum > 0) { // 对票数判断 票数大于零 我们才抢票
            System.out.println("我在"+Thread.currentThread().getName()+"买到了第" + ticketNum-- + "张车票");
        }
    }
}
