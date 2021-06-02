package com.msb.test10;

public class CustomerThread extends Thread {
    // 共享商品
    private Product p;

    public CustomerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // 生产10个商品
            synchronized (p) {
                // 将消费信息做一个打印
                System.out.println("消费者消费了："+ p.getBrand() + "---" + p.getName());
            }

        }
    }
}
