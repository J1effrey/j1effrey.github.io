package com.msb.test12;

public class Test {
    public static void main(String[] args) {
        // 共享商品
        Product p = new Product();
        // 创建生产者和消费者线程
        new ProducerThread(p).start();
        new CustomerThread(p).start();
    }
}
