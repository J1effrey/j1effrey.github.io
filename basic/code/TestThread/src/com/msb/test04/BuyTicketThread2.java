package com.msb.test04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BuyTicketThread2 implements Runnable{
    int ticketNum = 10;
    Lock lock = new ReentrantLock(); // 多态 接口=实现类 可以使用不同实现类
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 打开锁
            try {
                lock.lock();
                if (ticketNum > 0) {
                    System.out.println("我在" + Thread.currentThread().getName() + "买到了第" + ticketNum-- + "张车票");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                // 关闭锁 ----> 即使有异常，这个锁也可以得到释放
                lock.unlock();
            }
        }
    }

}
