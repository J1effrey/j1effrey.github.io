package com.msb.test02;

/**
 * @author Jeffrey
 * GenericTest就是一个普通类
 * GenericTest<A> 就是一个泛型类
 * <>里面就是一个参数类型 类型不确定 相当于一个占位
 * 但是现在确定的是这个类型一定是一个引用数据类型，而不是基本数据类型
 */
public class GenericTest<E> {
    int age;
    String name;
    E sex;

    public void a(E n){

    }

    public void b(E[] m){

    }
}

class SubGenericTest extends GenericTest<Integer>{

}

// 如果父类不指定泛型，那么子类也会变成一个泛型类，那这个E的类型可以再创建子类对象的时候确定
class SubGenericTest2<E> extends GenericTest<E>{

}

class Demo2{
    public static void main(String[] args) {
        final SubGenericTest2<String> s = new SubGenericTest2<String>();
        s.a("abc");
        s.sex = "female";
    }
}
class Demo{
    public static void main(String[] args) {
        // 指定父类泛型，那么子类就不需要再指定泛型了，可以直接使用
        SubGenericTest sgt = new SubGenericTest();
        sgt.a(2);
    }
}
class Test{
    public static void main(String[] args) {
        // 1.实例化不指定泛型，那么认为此泛型为Object类型
        GenericTest gt1 = new GenericTest();
        gt1.a("abc");
        gt1.a(9.8);
        gt1.b(new String[]{"a","b","c"});

        // 2.实例化指定泛型
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.sex = "male";
        gt2.a("abc");
        gt2.b(new String[]{"a","b","c"});
    }
}
