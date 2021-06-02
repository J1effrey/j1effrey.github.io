package com.msb.test09;

public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 6) {
                Thread.currentThread().stop();
            }
            System.out.println(i);
        }
    }
}
