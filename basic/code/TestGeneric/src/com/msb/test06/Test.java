package com.msb.test06;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /*public void a(List<Object> list) {

    }

    public void a(List<String> list) {

    }

    public void a(List<Integer> list) {

    }*/

    // 使用通配符
    public void a(List<?> list) {
        // 1.遍历：
        for (Object o : list) {
            System.out.println(o);
        }

        // 2。数据的写入操作：
        // list.add("abc")  ---> 出错，不能随意添加数据
        list.add(null);

        // 3.数据的读取操作：
        Object s = list.get(0);
    }
}
class T{
    public static void main(String[] args) {
        Test t = new Test();
        t.a(new ArrayList<Integer>());
        t.a(new ArrayList<String>());
        t.a(new ArrayList<Object>());
    }
}
