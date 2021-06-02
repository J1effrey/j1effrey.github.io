package com.msb.test11;

public class Product { // 商品类
    // 品牌
    private String brand;
    // 名字
    private String name;
    // 引入一个灯： true：红色   false：绿色
    boolean flag = false;   // 默认情况下没有商品 让生产者先生产 然后消费者再消费

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

    public synchronized void setProduct(String brand,String name){
        if (flag) { // 灯是红色 证明有商品 生产者不生产， 等着消费者消费
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 灯是绿色的就生产
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        // 将生产信息做一个打印
        System.out.println("生产者生产了："+ this.brand + "---" + this.name);

        // 生产完以后 灯变成红色
        flag = true;
        // 告诉消费者赶紧消费
        notify();
    }

    public synchronized void getProduct() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 有商品，消费
        System.out.println("消费者消费了：" + this.brand + "---" + this.name);

        // 消费完：灯变色
        flag = false;
        // 通知生产者
        notify();
    }
}
