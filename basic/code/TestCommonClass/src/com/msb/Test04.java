package com.msb;

public class Test04 {
	public static void main(String args[]) {
		Integer i1 = new Integer(6);
		Integer i2 = new Integer(12);
		System.out.println(i1.compareTo(i2)); // return (x<y) ? -1 : ((x==y) ? 0 : 1)
		// equals: Integer对Object中的equals方法进行了重写，比较的是底层封装的value值
		// Integer对象是通过new关键字创建的对象
		Integer i3 = new Integer(12);
		Integer i4 = new Integer(12);
		System.out.println(i3 == i4); // false 比较的是两个对象的地址 
		boolean flag = i3.equals(i4);
		System.out.println(flag);

		// Integer对象通过自动装箱来完成
		Integer i5 = 12;
		Integer i6 = 12;
		System.out.println(i5.equals(i6)); // true
		System.out.println(i5 == i6); // true
		// 当Integer
	}
}