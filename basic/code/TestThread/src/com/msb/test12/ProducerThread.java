package com.msb.test12;

public class ProducerThread extends Thread{
    // 共享商品
    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // 生产10个商品
            if (i % 2 == 0) {
                p.setProduct("费列罗", "巧克力");
            } else {
                p.setProduct("哈尔滨", "啤酒");
            }

        }
    }
}
