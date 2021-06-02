package com.msb.test01;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        // 创建一个ArrayList的集合 像这个集合中存入学生的数据
        // 加入泛型优点：在编译期就会对类型进行检查，不是泛型对应的类型就不可以添加进这个集合
        ArrayList<Integer> al = new ArrayList<>();
        al.add(98);
        al.add(18);
        al.add(39);
        al.add(60);
        al.add(40);
        // al.add("xiaoli");
        /*for (Object o : al) {
            System.out.println(o);
        }*/

        // 对集合遍历查看
        for (Integer integer : al) {
            System.out.println(integer);
        }
    }
}
