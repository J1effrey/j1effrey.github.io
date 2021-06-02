package com.msb.test05;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        String s = new String();
        obj = s;

        Object[] objArr = new Object[10];
        String[] strArr = new String[10];
        objArr = strArr; // 多态

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        // list1 = list2;

        // 总结：A和B是子类父类关系，但G<A> G<B>不存在继承关系。是并列关系
    }
}
