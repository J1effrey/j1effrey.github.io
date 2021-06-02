package com.msb.test09;

public class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
 class Test{
     public static void main(String[] args) {
         final TestThread tt = new TestThread();
         tt.setDaemon(true); // 设置便随线程 注意：先设置 再启动
         tt.start();

         for (int i = 0; i < 10; i++) {
             System.out.println("main--"+i);
         }
     }
 }