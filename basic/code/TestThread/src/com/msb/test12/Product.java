package com.msb.test12;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Product { // 商品类

    private String brand;
    private String name;

    // 声明一个Lock锁：
    Lock lock = new ReentrantLock();
    // 搞一个生产者的等待队列
    Condition produceCondition = lock.newCondition();
    // 搞一个消费者的等待队列
    Condition consumeCondition = lock.newCondition();

    boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(String brand,String name){
        lock.lock();
        try {
            if (flag) {
                try {
                    // wait();
                    // 生产者阻塞，生产者进入等待队列
                    produceCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            System.out.println("生产者生产了："+ this.brand + "---" + this.name);
            flag = true;
            consumeCondition.signal();
        }finally {
            lock.unlock();
        }

    }

    public synchronized void getProduct() {
        lock.lock();
        try {
            if (!flag) {
                try {
                    consumeCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("消费者消费了：" + this.brand + "---" + this.name);
            flag = false;
            produceCondition.signal();
        }finally {
            lock.unlock();
        }
    }
}
