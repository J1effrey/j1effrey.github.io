package com.msb.test01;

/**
 * @author Jeffrey
 */
public class TestThread extends Thread {
    public TestThread(String name){
        super(name); // 调用父类的有参构造器
    }
    /*
    一会线程就开始抢资源了，这个线程要执行的任务到底是啥？这个任务你要放在方法中
    但是这个方法不能是随便写的一个方法，必须重写Thread类中的run方法
    然后线程的任务/逻辑写在run方法中
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+i);
        }
    }
}
