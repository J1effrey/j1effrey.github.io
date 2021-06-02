package com.msb.test12;

public class CustomerThread extends Thread {
    // 共享商品
    private Product p;

    public CustomerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // 生产10个商品
            p.getProduct();
        }
    }
}
