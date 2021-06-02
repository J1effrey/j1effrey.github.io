package com.msb.test03;

// 1.泛型可以定义多个参数类型
public class TestGeneric<A,B,C> {
    A age;
    B name;
    C sex;

    // 6.不能直接使用E[]创建
    public void a(A m,B n,C x) {
        // 不可以：A[] i = new A[10];
        A[] i = (A[]) new Object[10];
    }

    // 2.构造器写法
    public TestGeneric() {

    }

    /*public void b() {
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
        // 3.不同泛型不能赋值
        list1 == list2;
    }*/

    // 5.泛型中的静态方法不能使用类的泛型
    /*public static int c(A a){
        return 10;
    }*/
}
