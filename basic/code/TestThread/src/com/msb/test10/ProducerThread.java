package com.msb.test10;

public class ProducerThread extends Thread{
    // 共享商品
    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // 生产10个商品
            synchronized (p) {
                if (i % 2 == 0) {
                    p.setBrand("费列罗");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("巧克力");
                } else {
                    p.setBrand("哈尔滨");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("啤酒");
                }

                // 将生产信息做一个打印
                System.out.println("生产者生产了："+ p.getBrand() + "---" + p.getName());
            }

        }
    }
}
