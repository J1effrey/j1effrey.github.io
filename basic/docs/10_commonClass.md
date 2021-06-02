## 10. 常用类

### 10.1 包装类

[1] 什么是包装类：

以前定义变量，经常使用数据的基本类型，
对于基本数据类型来说 它就是一个数 加点属性 加点方法 加点构造器
将基本数据类型对应进行了一个封装 产生了一个新的类 ----> 包装类
int，byte...  ----> 基本数据类型

---

[2] 

| 基本数据类型 | 对应的包装类 | 继承关系             |
| ------------ | ------------ | -------------------- |
| byte         | Byte         | -->Number --> Object |
| short        | Short        | -->Number --> Object |
| int          | Integer      | -->Number --> Object |
| long         | Long         | -->Number --> Object |
| float        | Float        | -->Number --> Object |
| double       | Double       | -->Number --> Object |
| char         | Character    | --> Object           |
| boolean      | Boolean      | --> Object           |

---

[3] 已经有基本数据类型了，为什么要封装包装类？

- java语言 面向对象语言 擅长操作各种各样的类
- 以前 ---- 数组 int[] string[] double[] Student[]
- 以后 ---- 集合 只能装引用数据类型

---

[4] 是不是有了包装类就不用基本数据类型了

__No!__

### 10.2 Integer

### 10.3 String类

1. string is constant
2. string不可以被继承 final
3. string底层是一个char类型的数组

#### a. 常用方法

### 10.4 StringBuilder类

#### 面试题：String StringBuilder StringBuffer区别与联系：

1. String类是不可变类，即一旦一个String对象被创建后，包含在这个对象中的字符序列是不可改变的，直至这个对象被销毁
2. StringBuffer类代表一个字符序列可变的字符串，可以通过append、insert、reverse、setCharAt、setLength等方法改变其内容。一旦生成了最终的字符串，调用toString方法将其转变为String
3. JDK1.5 新增了一个StringBuilder类，与StringBuffer相似，构造方法和方法基本相同。不同是StringBuffer是线程安全的，而StringBuilder是线程不安全的，所以性能略高。通常情况下，创建一个内容可变的字符串，应优先考虑使用StringBuilder

StringBuilder：JDK1.5开始 效率高 线程不安全
StringBuffer：JDK1.0开始 效率低 线程安全