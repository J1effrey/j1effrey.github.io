package com.msb.test04;

/**
 * @author Jeffrey
 * @param <E>
 * 1.什么是泛型方法：
 * 泛型方法有要求：这个方法泛型的参数类型要和当前泛型无关
 * 2.泛型方法定义的时候，前面要加上<T>
 *     原因：如果不加T时，会把T当作数据类型，然而代码中没有T会报错
 */
public class TestGeneric<E> {
    // 不是泛型方法
    public void a(E e){

    }

    // 泛型方法
    public <T> void b(T t){

    }

    // 可以设置静态泛型方法
    public static <T> void c(T t){

    }
}

class Demo{
    public static void main(String[] args) {
        final TestGeneric<String> tg = new TestGeneric<String>();
        tg.a("abc");
        tg.b("abc");
        tg.b(2);
        tg.b(true);
    }
}

