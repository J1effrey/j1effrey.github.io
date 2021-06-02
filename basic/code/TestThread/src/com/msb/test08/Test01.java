package com.msb.test08;

public class Test01 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("xxxxxxxxx");
    }
}
